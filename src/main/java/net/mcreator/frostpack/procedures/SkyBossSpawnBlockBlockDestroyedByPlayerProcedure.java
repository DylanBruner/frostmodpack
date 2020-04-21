package net.mcreator.frostpack.procedures;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.frostpack.world.dimension.SkyDimensionDimension;
import net.mcreator.frostpack.entity.SkyBossEntity;
import net.mcreator.frostpack.FrostPackVariables;
import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class SkyBossSpawnBlockBlockDestroyedByPlayerProcedure extends FrostPackElements.ModElement {
	public SkyBossSpawnBlockBlockDestroyedByPlayerProcedure(FrostPackElements instance) {
		super(instance, 50);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SkyBossSpawnBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SkyBossSpawnBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SkyBossSpawnBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SkyBossSpawnBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SkyBossSpawnBlockBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double isspawned = 0;
		if (((SkyDimensionDimension.type.getId()) == (world.getDimension().getType().getId()))) {
			if (((FrostPackVariables.skybossspawnedglobal) == 0)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new SkyBossEntity.CustomEntity(SkyBossEntity.entity, world);
					entityToSpawn.setLocationAndAngles(x, (y + 5), z, world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
				FrostPackVariables.skybossspawnedglobal = (double) 1;
			}
		} else {
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("This can only be used in the sky dimension!"), (true));
			}
		}
	}
}
