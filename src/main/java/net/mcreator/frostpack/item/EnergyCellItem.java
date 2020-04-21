
package net.mcreator.frostpack.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.frostpack.procedures.EnergyCellItemInHandTickProcedure;
import net.mcreator.frostpack.itemgroup.ModTabItemGroup;
import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class EnergyCellItem extends FrostPackElements.ModElement {
	@ObjectHolder("frostpack:energycell")
	public static final Item block = null;
	public EnergyCellItem(FrostPackElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ModTabItemGroup.tab).maxStackSize(64));
			setRegistryName("energycell");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			if (selected) {
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				EnergyCellItemInHandTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
