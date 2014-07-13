package net.classlessrook32.FoodPlus.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.classlessrook32.FoodPlus.mod.FoodPlus;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class LargePot extends Item {

	public LargePot() {
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(10000);
		this.setNoRepair();
		this.setCreativeTab(FoodPlus.classtab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(FoodPlus.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
