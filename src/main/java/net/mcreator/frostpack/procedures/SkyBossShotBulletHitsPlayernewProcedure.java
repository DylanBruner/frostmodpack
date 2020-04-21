package net.mcreator.frostpack.procedures;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;

import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class SkyBossShotBulletHitsPlayernewProcedure extends FrostPackElements.ModElement {
	public SkyBossShotBulletHitsPlayernewProcedure(FrostPackElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SkyBossShotBulletHitsPlayernew!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SkyBossShotBulletHitsPlayernew!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SkyBossShotBulletHitsPlayernew!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SkyBossShotBulletHitsPlayernew!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.BREAK);
		}
	}
}
