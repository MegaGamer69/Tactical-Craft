package org.tactical.items.bullets;

import net.minecraft.world.item.Item;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterEvent;

import org.tactioncraft.TacticalCraft;

@Mod.EventBusSubscriber(modid = TacticalCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Dot44Munition {
	public static final ITEM = Registration.ITEMS.register(".44 Ammo");
}
