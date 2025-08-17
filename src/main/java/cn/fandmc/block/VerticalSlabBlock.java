package cn.fandmc.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class VerticalSlabBlock extends HorizontalFacingBlock implements Waterloggable {
    
    public static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    
    // 竖半砖的碰撞箱 - 东西方向（X轴）
    protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    // 南北方向（Z轴）
    protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    // 双层竖半砖
    protected static final VoxelShape DOUBLE_SHAPE = VoxelShapes.fullCube();
    
    public VerticalSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(TYPE, SlabType.BOTTOM)
                .with(FACING, Direction.SOUTH)
                .with(WATERLOGGED, false));
    }
    

    
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, FACING, WATERLOGGED);
    }
    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        SlabType slabType = state.get(TYPE);
        if (slabType == SlabType.DOUBLE) {
            return DOUBLE_SHAPE;
        }
        
        Direction facing = state.get(FACING);
        switch (facing) {
            case EAST:
                return EAST_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case NORTH:
                return NORTH_SHAPE;
            default:
                return SOUTH_SHAPE;
        }
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        
        if (blockState.isOf(this)) {
            return blockState.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, false);
        }
        
        FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
        Direction facing = ctx.getHorizontalPlayerFacing().getOpposite();
        
        return this.getDefaultState()
                .with(TYPE, SlabType.BOTTOM)
                .with(FACING, facing)
                .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }
    
    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        SlabType slabType = state.get(TYPE);
        
        if (slabType != SlabType.DOUBLE && itemStack.isOf(this.asItem())) {
            if (context.canReplaceExisting()) {
                return true;
            } else {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
    
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return state.get(TYPE) != SlabType.DOUBLE && Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
    }
    
    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(TYPE) != SlabType.DOUBLE && Waterloggable.super.canFillWithFluid(world, pos, state, fluid);
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    
    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        switch (type) {
            case LAND:
                return false;
            case WATER:
                return state.get(WATERLOGGED);
            case AIR:
                return false;
            default:
                return false;
        }
    }
}