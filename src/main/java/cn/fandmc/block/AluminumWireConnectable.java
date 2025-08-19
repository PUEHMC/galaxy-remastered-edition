package cn.fandmc.block;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;

/**
 * 标识可以与铝线连接的方块接口
 */
public interface AluminumWireConnectable {
    /**
     * 检查指定方向是否可以与铝线连接
     * @param direction 连接方向
     * @return 是否可以连接
     */
    boolean canConnectAluminumWire(Direction direction);
    
    /**
     * 检查指定方向是否可以与铝线连接（带状态参数）
     * @param state 当前方块状态
     * @param direction 连接方向
     * @return 是否可以连接
     */
    default boolean canConnectAluminumWire(BlockState state, Direction direction) {
        return canConnectAluminumWire(direction);
    }
}