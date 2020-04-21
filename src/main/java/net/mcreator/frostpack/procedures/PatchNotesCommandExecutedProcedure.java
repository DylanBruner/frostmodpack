package net.mcreator.frostpack.procedures;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class PatchNotesCommandExecutedProcedure extends FrostPackElements.ModElement {
	public PatchNotesCommandExecutedProcedure(FrostPackElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PatchNotesCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PatchNotesCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof PlayerEntity && !world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("v1.6"), (false));
		}
	}
}
