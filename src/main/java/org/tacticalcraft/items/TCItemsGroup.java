package org.tacticalcraft.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class TCItemsGroup
{
	public static final ItemGroup HEAVY_PISTOLS = new ItemGroup("tactical_craft_heavy_pistols")
	{
		public ItemStack makeIcon()
		{
			return new ItemStack(Items.IRON_INGOT);
		}
	};

    public static final ItemGroup HEAVY_AMMO = new ItemGroup("tactical_craft_heavy_ammo")
    {
        public ItemStack makeIcon()
        {
            return new ItemStack(Items.IRON_NUGGET);
        }
    };
	
	public static final ItemGroup LIGHT_KNIFES = new ItemGroup("tactical_craft_light_knifes")
	{
		public ItemStack makeIcon()
		{
			return new ItemStack(Items.IRON_SWORD);
		}
	};
}
