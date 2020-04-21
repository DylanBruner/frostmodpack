
package net.mcreator.frostpack.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.frostpack.itemgroup.ModTabItemGroup;
import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class WhiteDiamondPickaxeItem extends FrostPackElements.ModElement {
	@ObjectHolder("frostpack:whitediamondpickaxe")
	public static final Item block = null;
	public WhiteDiamondPickaxeItem(FrostPackElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -1f, new Item.Properties().group(ModTabItemGroup.tab)) {
		}.setRegistryName("whitediamondpickaxe"));
	}
}
