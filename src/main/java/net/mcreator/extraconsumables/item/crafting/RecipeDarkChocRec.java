
package net.mcreator.extraconsumables.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.extraconsumables.item.ItemDarkChocolateBase;
import net.mcreator.extraconsumables.item.ItemDarkChocolate;
import net.mcreator.extraconsumables.ElementsExtraConsumables;

@ElementsExtraConsumables.ModElement.Tag
public class RecipeDarkChocRec extends ElementsExtraConsumables.ModElement {
	public RecipeDarkChocRec(ElementsExtraConsumables instance) {
		super(instance, 16);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDarkChocolateBase.block, (int) (1)), new ItemStack(ItemDarkChocolate.block, (int) (1)), 1F);
	}
}
