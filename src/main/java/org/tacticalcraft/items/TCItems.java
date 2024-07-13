package org.tacticalcraft.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterEvent;

import org.tacticalcraft.TacticalCraft;

@Mod.EventBusSubscriber(modid = TacticalCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TCItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TacticalCraft.MOD_ID);
	
	@ObjectHolder(TacticalCraft.MOD_ID + ":dot_44_ammo")
	public static final Item DOT_44_AMMO = null;

	@ObjectHolder(TacticalCraft.MOD_ID + ":improvised_knife")
	public static final Item IMPROVISED_KNIFE = null;

	public static final RegistryObject<Item> DOT_44_AMMO_ITEM = ITEMS.register("dot_44_ammo",
		() -> new Item(new Item().Properties().group(ItemGroup.ITEMS))
	);

	public static final RegistryObject<Item> IMPROVISED_KNIFE_ITEM = ITEMS.register("improvised_knife",
		() -> new Item(new Item().Properties().group(ItemGroup.COMBAT))
	);

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event)
	{
		ITEMS.register(event.getRegistry());
	}
}
