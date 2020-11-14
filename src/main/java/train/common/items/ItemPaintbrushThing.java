package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.List;

public class ItemPaintbrushThing extends Item {

    public ItemPaintbrushThing() {
        setCreativeTab(Traincraft.tcTab);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":paintbrushThing");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + EnumChatFormatting.GREEN + "Shift-right click" + EnumChatFormatting.GRAY + " on a train to cycle through it's textures.");
        par3List.add("\u00a77" + "We couldn't think of a better name for it");
    }
}
