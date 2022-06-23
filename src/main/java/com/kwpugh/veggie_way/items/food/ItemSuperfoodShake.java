package com.kwpugh.veggie_way.items.food;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemSuperfoodShake extends Item
{	
	public ItemSuperfoodShake(Settings properties)
	{
		super(properties);
	}
	
	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((Text.translatable("item.veggie_way.superfood_shake.line1").formatted(Formatting.GREEN)));
	}
}
