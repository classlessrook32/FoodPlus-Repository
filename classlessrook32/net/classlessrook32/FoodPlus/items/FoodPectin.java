package net.classlessrook32.FoodPlus.items;

import net.classlessrook32.FoodPlus.mod.FoodPlus;
import net.minecraft.item.ItemFood;

public class FoodPectin extends ItemFood{

	public FoodPectin(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
		
		
		this.setPotionEffect(9, 60, 1, 0.6F);
		this.setPotionEffect(1, 40, 2, 0.1F);
		this.setPotionEffect(17, 60, 2, 0.6F);
		this.setPotionEffect(15, 60, 2, 0.6F);
		this.setTextureName(FoodPlus.modid + ":" + "Pectin");
		this.setCreativeTab(FoodPlus.classtab);


	}

}
