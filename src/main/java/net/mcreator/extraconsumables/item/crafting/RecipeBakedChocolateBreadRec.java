
package net.mcreator.extraconsumables.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.extraconsumables.item.ItemRawChocolateBread;
import net.mcreator.extraconsumables.item.ItemBakedChocolateBread;
import net.mcreator.extraconsumables.ElementsExtraConsumables;

@ElementsExtraConsumables.ModElement.Tag
public class RecipeBakedChocolateBreadRec extends ElementsExtraConsumables.ModElement {
	public RecipeBakedChocolateBreadRec(ElementsExtraConsumables instance) {
		super(instance, 28);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawChocolateBread.block, (int) (1)), new ItemStack(ItemBakedChocolateBread.block, (int) (1)), 1F);
	}
}
