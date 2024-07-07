package org.tactical.items.bullets;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.CreativeTab;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterEvent;

import org.tacticalcraft.TacticalCraft;

@ObjectHolder(TacticalCraft.MOD_ID)
public class Dot44Munition {
	public static final RegistryObject<Item> DOT_44_ITEM = Registration.ITEMS.register("dot_44_ammo",
		() -> new Item(new Properties().tab())
	);
	
	@Mod.EventBusSubscriber(modid = TacticalCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Registration {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item>) {
			event.getRegistry().registerAll(
				DOT_44_AMMO.get()
			);
		}
	}
}
