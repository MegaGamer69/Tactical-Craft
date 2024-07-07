package org.tacticalcraft.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class TCItemsGroup
{
	public static final ItemGroup HEAVY_PISTOLS = new ItemGroup("tactical_craft_heavy_pistols")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Items.IRON_INGOT);
		}
	};
	
	public static final ItemGroup LIGHT_KNIFES = new ItemGroup("tactical_craft_light_knifes")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Items.IRON_SWORD);
		}
	};
}
