
package net.mcreator.extraconsumables.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.extraconsumables.item.ItemCaramel;
import net.mcreator.extraconsumables.ElementsExtraConsumables;

@ElementsExtraConsumables.ModElement.Tag
public class RecipeCaramelRec extends ElementsExtraConsumables.ModElement {
	public RecipeCaramelRec(ElementsExtraConsumables instance) {
		super(instance, 8);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.SUGAR, (int) (1)), new ItemStack(ItemCaramel.block, (int) (1)), 1F);
	}
}
