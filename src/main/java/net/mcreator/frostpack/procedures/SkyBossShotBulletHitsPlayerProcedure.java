package net.mcreator.frostpack.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.entity.effect.LightningBoltEntity;

import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class SkyBossShotBulletHitsPlayerProcedure extends FrostPackElements.ModElement {
	public SkyBossShotBulletHitsPlayerProcedure(FrostPackElements instance) {
		super(instance, 47);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SkyBossShotBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SkyBossShotBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SkyBossShotBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SkyBossShotBulletHitsPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (world instanceof ServerWorld)
			((ServerWorld) world).addLightningBolt(new LightningBoltEntity(world, (int) x, (int) y, (int) z, false));
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 3, Explosion.Mode.BREAK);
		}
	}
}
