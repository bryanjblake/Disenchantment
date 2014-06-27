package net.minecraft.bjbinc.disenchant;


import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Disenchant.MODID, version = Disenchant.VERSION)
public class Disenchant

{
	public static final String MODID = "Disenchanting";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(Items.wooden_sword), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.wooden_sword,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.stone_sword), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.stone_sword,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_sword), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_sword,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_sword), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_sword,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_sword), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_sword,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.wooden_pickaxe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.stone_pickaxe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_pickaxe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_pickaxe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_pickaxe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_pickaxe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_pickaxe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_pickaxe,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.wooden_axe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.wooden_axe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.stone_axe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.stone_axe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_axe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_axe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_axe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_axe,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_axe), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_axe,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.wooden_shovel,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.stone_shovel), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.stone_shovel,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_shovel), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_shovel,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_shovel), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_shovel,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_shovel), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_shovel,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.bow), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.bow,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.leather_helmet), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.leather_helmet,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.chainmail_helmet,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_helmet), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_helmet,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_helmet), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_helmet,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_helmet), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_helmet,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.leather_chestplate), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.leather_chestplate,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.chainmail_chestplate,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_chestplate), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_chestplate,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_chestplate), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_chestplate,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_chestplate), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_chestplate,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.leather_leggings), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.leather_leggings,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.chainmail_leggings,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_leggings), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_leggings,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_leggings), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_leggings,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_leggings), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_leggings,1,OreDictionary.WILDCARD_VALUE));

		GameRegistry.addRecipe(new ItemStack(Items.leather_boots), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.leather_boots,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.chainmail_boots,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.iron_boots), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.iron_boots,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.golden_boots), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.golden_boots,1,OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(Items.diamond_boots), "l l"," d ","l l",'l',new ItemStack(Items.emerald),'d',new ItemStack(Items.diamond_boots,1,OreDictionary.WILDCARD_VALUE));
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	FMLCommonHandler.instance().bus().register(new CraftingEventHandler());
	}
}
