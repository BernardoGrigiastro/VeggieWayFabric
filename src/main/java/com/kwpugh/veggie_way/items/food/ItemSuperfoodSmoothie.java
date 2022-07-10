package com.kwpugh.veggie_way.items.food;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class ItemSuperfoodSmoothie extends Item
{	
	public ItemSuperfoodSmoothie(Settings properties)
	{
		super(properties);
	}

	public UseAction getUseAction(ItemStack stack)
	{
		return UseAction.DRINK;
	}
}