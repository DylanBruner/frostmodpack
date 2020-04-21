package net.mcreator.frostpack.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class GmspCommandExecutedProcedure extends FrostPackElements.ModElement {
	public GmspCommandExecutedProcedure(FrostPackElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GmspCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
	}
}
