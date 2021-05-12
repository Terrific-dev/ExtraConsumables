
package net.mcreator.extraconsumables.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.extraconsumables.item.ItemMilkChocolateBase;
import net.mcreator.extraconsumables.item.ItemMilkChocolate;
import net.mcreator.extraconsumables.ElementsExtraConsumables;

@ElementsExtraConsumables.ModElement.Tag
public class RecipeMilkChocolateRec extends ElementsExtraConsumables.ModElement {
	public RecipeMilkChocolateRec(ElementsExtraConsumables instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMilkChocolateBase.block, (int) (1)), new ItemStack(ItemMilkChocolate.block, (int) (1)), 1F);
	}
}
