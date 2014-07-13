package net.classlessrook32.FoodPlus.mod;

import net.classlessrook32.FoodPlus.items.CuttingKnife;
import net.classlessrook32.FoodPlus.items.FoodPectin;
import net.classlessrook32.FoodPlus.items.LargePot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = FoodPlus.modid, version = FoodPlus.version)

public class FoodPlus {
	
	//creative tabs
		public static CreativeTabs classtab = new CreativeTabs("FoodPlus"){
				public Item getTabIconItem() {
					return FoodPeanut;
				}		
			};
			
	    public static final String modid = "Mo' Food! - made by Classlessrook32";
	    public static final String version = "v0.1";
	    
	    //Food
	    public static Item FoodCreamyPeanutButter;
	    public static Item FoodChunkyPeanutButter;
	    public static Item FoodPeanut;
	    public static Item FoodRoastedPeanut;
	    public static Item FoodChunkyPeanutButterAndJellySandwich;
	    public static Item FoodCreamyPeanutButterAndJellySandwich;
	    public static Item FoodGrapes;
	    public static Item FoodPectin;
	    public static Item FoodSlicedApple;
	    public static Item FoodSliceOfBread;
	 
	    
	    
	    //tools
	    public static Item ItemCuttingKnife;
	    public static Item ItemLargePot;
	    
	    //items
	    public static Item ItemStainlessSteelIngot;
	    
	    
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event) {
	    //recipes(shaped)
	    	GameRegistry.addRecipe(new ItemStack(ItemLargePot), new Object[]{"x x", "xxx", 'x', ItemStainlessSteelIngot});
	    	
	    //recipes(shapeless)
	    	GameRegistry.addShapelessRecipe(new ItemStack(FoodSlicedApple, 4), Items.apple, ItemCuttingKnife); 	   
	    	GameRegistry.addShapelessRecipe(new ItemStack(FoodPectin, 1), FoodSlicedApple, ItemLargePot);    
	    
	    
	    
	    }

	    
	    

	    @EventHandler
	    public void Preinit(FMLPreInitializationEvent event) {
	    	
	    //food	details
	    FoodChunkyPeanutButter = new ItemFood(2, 0.4F, false).setCreativeTab(classtab).setUnlocalizedName("ChunkyPeanutButter").setTextureName(modid + ":" + "ChunkyPeanutButter");
	    FoodCreamyPeanutButter = new ItemFood(2, 0.4F, true).setCreativeTab(classtab).setUnlocalizedName("CreamyPeanutButter").setTextureName(modid + ":" + "CreamyPeanutButter");
	    FoodPeanut = new ItemFood(1, 0.1F, false).setCreativeTab(classtab).setUnlocalizedName("Peanut").setTextureName(modid + ":" + "Peanut");
	    FoodRoastedPeanut = new ItemFood(5, 0.4F, false).setCreativeTab(classtab).setUnlocalizedName("RoastedPeanut").setTextureName(modid + ":" + "RoastedPeanut");
	    FoodChunkyPeanutButterAndJellySandwich = new ItemFood(9, 0.5F, false).setCreativeTab(classtab).setUnlocalizedName("ChunkyPeanutButterAndJellySandwich").setTextureName(modid + ":" + "ChunkyPeanutButterAndJellySandwich");
	    FoodCreamyPeanutButterAndJellySandwich = new ItemFood(8, 0.5F, true).setCreativeTab(classtab).setUnlocalizedName("CreamyPeanutButterAndJellySandwich").setTextureName(modid + ":" + "CreamyPeanutButterAndJellySandwich");
	    FoodGrapes = new ItemFood(1, 0.1F, true).setCreativeTab(classtab).setUnlocalizedName("Grapes").setTextureName(modid + ":" + "Grapes"); 
	    FoodSlicedApple = new ItemFood(1, 0.3F, true).setCreativeTab(classtab).setUnlocalizedName("SlicedApple").setTextureName(modid + ":" + "SlicedApple");
	    FoodPectin = new FoodPectin(1, 0.1F, false).setUnlocalizedName("Pectin");
	    FoodSliceOfBread = new ItemFood(3, 0.6F, false).setCreativeTab(classtab).setUnlocalizedName("SliceOfBread").setTextureName(modid + ":" + "SliceOfBread");
	    
	    //items details
	    ItemStainlessSteelIngot = new Item().setCreativeTab(classtab).setUnlocalizedName("StainlessSteelIngot").setTextureName(modid + ":" + "StainlessSteelIngot");
	    
	    
	    //tools 
	    ItemCuttingKnife = new CuttingKnife().setUnlocalizedName("CuttingKnife");
	    ItemLargePot = new LargePot().setUnlocalizedName("LargePot");
	    
	    //food Registry
	    GameRegistry.registerItem(FoodChunkyPeanutButter, "FoodChunkyPeanutButer");
	    GameRegistry.registerItem(FoodCreamyPeanutButter, "FoodCreamyPeanutButer");
	    GameRegistry.registerItem(FoodRoastedPeanut, "RoastedPeanut");
	    GameRegistry.registerItem(FoodPeanut, "FoodPeanut");
	    GameRegistry.registerItem(FoodChunkyPeanutButterAndJellySandwich, "ChunkyPeanutButterAndJellySandwich");
	    GameRegistry.registerItem(FoodCreamyPeanutButterAndJellySandwich, "CreamyPeanutButterAndJellySandwich");
	    GameRegistry.registerItem(FoodGrapes, "Grapes");
	    GameRegistry.registerItem(FoodSlicedApple, "SlicedApple");
	    GameRegistry.registerItem(FoodPectin, "Pectin");
	    GameRegistry.registerItem(FoodSliceOfBread, "SliceOfBread");
	    
	    
	    //item Registry
	    GameRegistry.registerItem(ItemStainlessSteelIngot, "StainlessSteelIngot");
	    
	    //tools registry
	    GameRegistry.registerItem(ItemCuttingKnife, "CuttingKnife");
	    GameRegistry.registerItem(ItemLargePot, "LargePot");

	    

	    }

	    
		
	
}


