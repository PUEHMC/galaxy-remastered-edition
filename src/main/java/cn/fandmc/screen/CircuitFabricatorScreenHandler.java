package cn.fandmc.screen;

import cn.fandmc.blockentity.CircuitFabricatorBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class CircuitFabricatorScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    
    // 客户端构造函数
    public CircuitFabricatorScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(10));
    }
    
    // 服务端构造函数
    public CircuitFabricatorScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ModScreenHandlers.CIRCUIT_FABRICATOR_SCREEN_HANDLER, syncId);
        checkSize(inventory, 10);
        this.inventory = inventory;
        
        // 添加机器的物品槽位
        // 输入槽位 (3x3 网格)
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.addSlot(new Slot(inventory, j + i * 3, 30 + j * 18, 17 + i * 18));
            }
        }
        
        // 输出槽位
        this.addSlot(new Slot(inventory, 9, 124, 35) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return false; // 输出槽不能放入物品
            }
        });
        
        // 玩家背包槽位
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 110 + i * 18));
            }
        }
        
        // 玩家快捷栏槽位
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 168));
        }
    }
    
    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }
            
            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        
        return newStack;
    }
    
    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
}