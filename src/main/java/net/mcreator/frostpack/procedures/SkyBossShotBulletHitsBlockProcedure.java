package net.mcreator.frostpack.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class SkyBossShotBulletHitsBlockProcedure extends FrostPackElements.ModElement {
	public SkyBossShotBulletHitsBlockProcedure(FrostPackElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SkyBossShotBulletHitsBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.remove();
	}
}
