package net.khaly.genmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.lwjgl.system.CallbackI;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("modtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}
