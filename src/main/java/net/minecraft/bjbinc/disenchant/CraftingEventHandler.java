package net.minecraft.bjbinc.disenchant;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftingEventHandler {


	@SubscribeEvent
	public void onItemCrafted(ItemCraftedEvent event)
	{
		try{
			if (event.craftMatrix.getStackInSlot(4)!=null){
					event.crafting.setItemDamage(event.craftMatrix.getStackInSlot(4).getItemDamage());
			}
		}
		catch(Exception e){

		}


	}
}
