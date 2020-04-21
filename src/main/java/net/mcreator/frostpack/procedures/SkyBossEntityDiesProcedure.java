package net.mcreator.frostpack.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.entity.effect.LightningBoltEntity;

import net.mcreator.frostpack.FrostPackVariables;
import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class SkyBossEntityDiesProcedure extends FrostPackElements.ModElement {
	public SkyBossEntityDiesProcedure(FrostPackElements instance) {
		super(instance, 40);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SkyBossEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SkyBossEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SkyBossEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SkyBossEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		FrostPackVariables.skybossspawnedglobal = (double) 0;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			if (world instanceof ServerWorld)
				((ServerWorld) world).addLightningBolt(new LightningBoltEntity(world, (int) x, (int) y, (int) z, false));
		}
	}
}
