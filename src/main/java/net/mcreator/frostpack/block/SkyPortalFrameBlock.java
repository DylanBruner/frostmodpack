
package net.mcreator.frostpack.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.frostpack.itemgroup.ModTabItemGroup;
import net.mcreator.frostpack.FrostPackElements;

import java.util.List;
import java.util.Collections;

@FrostPackElements.ModElement.Tag
public class SkyPortalFrameBlock extends FrostPackElements.ModElement {
	@ObjectHolder("frostpack:skyportalframe")
	public static final Block block = null;
	public SkyPortalFrameBlock(FrostPackElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ModTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(5f, 15f).lightValue(0).harvestLevel(5)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("skyportalframe");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
