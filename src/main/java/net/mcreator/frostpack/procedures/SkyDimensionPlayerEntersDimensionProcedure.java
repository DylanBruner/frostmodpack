package net.mcreator.frostpack.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.frostpack.entity.SkyBossEntity;
import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class SkyDimensionPlayerEntersDimensionProcedure extends FrostPackElements.ModElement {
	public SkyDimensionPlayerEntersDimensionProcedure(FrostPackElements instance) {
		super(instance, 41);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SkyDimensionPlayerEntersDimension!");
			return;
		}
		World world = (World) dependencies.get("world");
		boolean Bossspawned = false;
		double bosspawn = 0;
		if (((bosspawn) == 0)) {
			if (!world.isRemote) {
				Entity entityToSpawn = new SkyBossEntity.CustomEntity(SkyBossEntity.entity, world);
				entityToSpawn.setLocationAndAngles(0, 0, 0, world.rand.nextFloat() * 360F, 0);
				world.addEntity(entityToSpawn);
			}
			bosspawn = (double) 1;
		}
	}
}
