package net.khaly.genmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class SLItem extends Item {
    public SLItem(Properties pProperties) {
        super(pProperties);
    }

    public void onUpdate (ItemStack item,  Entity entity ) {
        if (entity instanceof EntityPlayer){
        }
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {



        }
    }

}
