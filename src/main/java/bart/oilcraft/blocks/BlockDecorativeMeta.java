package bart.oilcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Bart on 29-11-2014.
 */
public class BlockDecorativeMeta extends ItemBlock {
    public BlockDecorativeMeta(Block block) {
        super(block);
        setHasSubtypes(true);
    }


    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch (itemstack.getItemDamage()) {
            case 0:{
                name = "sturdystonebrick";
                break;
            }
            default:{
                name = "nothing";
            }
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}