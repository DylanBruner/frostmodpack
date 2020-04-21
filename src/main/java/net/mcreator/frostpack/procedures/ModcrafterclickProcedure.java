package net.mcreator.frostpack.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.frostpack.FrostPackElements;

@FrostPackElements.ModElement.Tag
public class ModcrafterclickProcedure extends FrostPackElements.ModElement {
	public ModcrafterclickProcedure(FrostPackElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Modcrafterclick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Modcrafterclick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		boolean modcrafteropen = false;
		world.setBlockState(new BlockPos((int) 200, (int) 200, (int) 200), Blocks.CRAFTING_TABLE.getDefaultState(), 3);
		modcrafteropen = (boolean) (true);
		if (entity instanceof PlayerEntity) {
			BlockPos _bp = new BlockPos((int) 200, (int) 200, (int) 200);
			world.getBlockState(_bp).getBlock().onBlockActivated(world.getBlockState(_bp), world, _bp, (PlayerEntity) entity, Hand.MAIN_HAND,
					BlockRayTraceResult.createMiss(new Vec3d(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
		}
	}
}
