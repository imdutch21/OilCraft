package bart.oilcraft.enchants;

import bart.oilcraft.lib.References;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;

/**
 * Created by Bart on 20-9-2014.
 */
public class EnchantSlippery extends Enchantment {
    public EnchantSlippery(int par1, int par2) {
        super(par1, par2, EnumEnchantmentType.digger);
        this.setName(References.MODID + ".Slippery");
    }

    public int getWeight()
    {
        return 6;
    }

    public static void addToBookList(Enchantment enchantment) {
        com.google.common.collect.ObjectArrays.concat(enchantmentsBookList, enchantment);
    }
}