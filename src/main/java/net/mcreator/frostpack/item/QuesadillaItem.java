
package net.mcreator.frostpack.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.frostpack.itemgroup.ModTabItemGroup;
import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class QuesadillaItem extends FrostPackElements.ModElement {
	@ObjectHolder("frostpack:quesadilla")
	public static final Item block = null;
	public QuesadillaItem(FrostPackElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ModTabItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(3).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("quesadilla");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
