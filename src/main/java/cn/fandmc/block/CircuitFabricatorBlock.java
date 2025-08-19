package cn.fandmc.block;

import cn.fandmc.blockentity.CircuitFabricatorBlockEntity;
import cn.fandmc.blockentity.ModBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CircuitFabricatorBlock extends BlockWithEntity implements AluminumWireConnectable {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public CircuitFabricatorBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }
    
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CircuitFabricatorBlockEntity(pos, state);
    }
    
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = (NamedScreenHandlerFactory) world.getBlockEntity(pos);
            
            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        
        return ActionResult.SUCCESS;
    }
    
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CircuitFabricatorBlockEntity) {
                ItemScatterer.spawn(world, pos, (CircuitFabricatorBlockEntity)blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }
    
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.CIRCUIT_FABRICATOR_BLOCK_ENTITY,
                (world1, pos, state1, blockEntity) -> CircuitFabricatorBlockEntity.tick(world1, pos, state1, blockEntity));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public boolean canConnectAluminumWire(Direction direction) {
        // 默认实现，需要在具体使用时传入BlockState
        return false;
    }

    /**
     * 检查指定方向是否可以与铝线连接（带状态参数）
     * @param state 当前方块状态
     * @param direction 连接方向
     * @return 是否可以连接
     */
    public boolean canConnectAluminumWire(BlockState state, Direction direction) {
        // 只允许左侧连接铝线
        // 需要考虑方块的朝向，计算相对的左侧
        if (state.contains(FACING)) {
            Direction facing = state.get(FACING);
            Direction leftSide = facing.rotateYCounterclockwise(); // 获取左侧方向
            return direction == leftSide.getOpposite(); // 检查连接方向是否是左侧的反方向
        }
        return false;
    }
}