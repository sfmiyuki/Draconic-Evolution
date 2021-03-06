package com.brandon3055.draconicevolution.client.render.block;

import com.brandon3055.draconicevolution.common.ModBlocks;
import com.brandon3055.draconicevolution.common.lib.References;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

/**
 * Created by Brandon on 25/5/2015.
 */
public class RenderPortal implements ISimpleBlockRenderingHandler {
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {

	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		Tessellator tess = Tessellator.instance;
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		int meta = world.getBlockMetadata(x, y, z);

		tess.setColorRGBA(0, 0, 0, 256);
		switch (meta){
			case 1:
				tess.addVertex(x-0.01, y-0.01, z+0.75);
				tess.addVertex(x-0.01, y+1.01, z+0.75);
				tess.addVertex(x+1.01, y+1.01, z+0.75);
				tess.addVertex(x+1.01, y-0.01, z+0.75);

				tess.addVertex(x+1.01, y-0.01, z+0.25);
				tess.addVertex(x+1.01, y+1.01, z+0.25);
				tess.addVertex(x-0.01, y+1.01, z+0.25);
				tess.addVertex(x-0.01, y-0.01, z+0.25);

				if (isFrame(world, x+1, y, z)){
					tess.addVertex(x+0.99, y-0.01, z+0.25);
					tess.addVertex(x+0.99, y-0.01, z+0.75);
					tess.addVertex(x+0.99, y+1.01, z+0.75);
					tess.addVertex(x+0.99, y+1.01, z+0.25);
				}
				if (isFrame(world, x-1, y, z)){
					tess.addVertex(x+0.01, y+1.01, z+0.25);
					tess.addVertex(x+0.01, y+1.01, z+0.75);
					tess.addVertex(x+0.01, y-0.01, z+0.75);
					tess.addVertex(x+0.01, y-0.01, z+0.25);
				}
				if (isFrame(world, x, y-1, z)){
					tess.addVertex(x-0.01, y+0.01,z+0.25);
					tess.addVertex(x-0.01, y+0.01,z+0.75);
					tess.addVertex(x+1.01, y+0.01,z+0.75);
					tess.addVertex(x+1.01, y+0.01,z+0.25);
				}
				if (isFrame(world, x, y+1, z)){
					tess.addVertex(x+1.01, y+0.99,z+0.25);
					tess.addVertex(x+1.01, y+0.99,z+0.75);
					tess.addVertex(x-0.01, y+0.99,z+0.75);
					tess.addVertex(x-0.01, y+0.99,z+0.25);
				}

			break;
			case 2:
				tess.addVertex(x+0.75, y-0.01, z-0.01);
				tess.addVertex(x+0.75, y-0.01, z+1.01);
				tess.addVertex(x+0.75, y+1.01, z+1.01);
				tess.addVertex(x+0.75, y+1.01, z-0.01);

				tess.addVertex(x+0.25, y+1.01, z-0.01);
				tess.addVertex(x+0.25, y+1.01, z+1.01);
				tess.addVertex(x+0.25, y-0.01, z+1.01);
				tess.addVertex(x+0.25, y-0.01, z-0.01);

				if (isFrame(world, x, y, z+1)){
					tess.addVertex(x+0.25, y-0.01, z+0.99);
					tess.addVertex(x+0.25, y+1.01, z+0.99);
					tess.addVertex(x+0.75, y+1.01, z+0.99);
					tess.addVertex(x+0.75, y-0.01, z+0.99);
				}
				if (isFrame(world, x, y, z-1)){
					tess.addVertex(x+0.75, y-0.01, z+0.01);
					tess.addVertex(x+0.75, y+1.01, z+0.01);
					tess.addVertex(x+0.25, y+1.01, z+0.01);
					tess.addVertex(x+0.25, y-0.01, z+0.01);
				}
				if (isFrame(world, x, y-1, z)){
					tess.addVertex(x+0.25, y+0.01, z-0.01);
					tess.addVertex(x+0.25, y+0.01, z+1.01);
					tess.addVertex(x+0.75, y+0.01, z+1.01);
					tess.addVertex(x+0.75, y+0.01, z-0.01);
				}
				if (isFrame(world, x, y+1, z)){
					tess.addVertex(x+0.75, y+0.99, z-0.01);
					tess.addVertex(x+0.75, y+0.99, z+1.01);
					tess.addVertex(x+0.25, y+0.99, z+1.01);
					tess.addVertex(x+0.25, y+0.99, z-0.01);
				}

			break;
			case 3:
				tess.addVertex(x-0.01, y+0.25, z-0.01);
				tess.addVertex(x-0.01, y+0.25, z+1.01);
				tess.addVertex(x+1.01, y+0.25, z+1.01);
				tess.addVertex(x+1.01, y+0.25, z-0.01);

				tess.addVertex(x+1.01, y+0.75, z-0.01);
				tess.addVertex(x+1.01, y+0.75, z+1.01);
				tess.addVertex(x-0.01, y+0.75, z+1.01);
				tess.addVertex(x-0.01, y+0.75, z-0.01);

				if (isFrame(world, x, y, z+1)){
					tess.addVertex(x-0.01, y+0.25, z+0.99);
					tess.addVertex(x-0.01, y+0.75, z+0.99);
					tess.addVertex(x+1.01, y+0.75, z+0.99);
					tess.addVertex(x+1.01, y+0.25, z+0.99);
				}
				if (isFrame(world, x, y, z-1)){
					tess.addVertex(x+1.01, y+0.25, z+0.01);
					tess.addVertex(x+1.01, y+0.75, z+0.01);
					tess.addVertex(x-0.01, y+0.75, z+0.01);
					tess.addVertex(x-0.01, y+0.25, z+0.01);
				}
				if (isFrame(world, x+1, y, z)){
					tess.addVertex(x+0.99, y+0.25, z-0.01);
					tess.addVertex(x+0.99, y+0.25, z+1.01);
					tess.addVertex(x+0.99, y+0.75, z+1.01);
					tess.addVertex(x+0.99, y+0.75, z-0.01);
				}
				if (isFrame(world, x-1, y, z)){
					tess.addVertex(x+0.01, y+0.75, z-0.01);
					tess.addVertex(x+0.01, y+0.75, z+1.01);
					tess.addVertex(x+0.01, y+0.25, z+1.01);
					tess.addVertex(x+0.01, y+0.25, z-0.01);
				}
		}
		GL11.glEnable(GL11.GL_ALPHA_TEST);

		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return false;
	}

	@Override
	public int getRenderId() {
		return References.idPortal;
	}

	private boolean isFrame(IBlockAccess access, int x, int y, int z){
		Block block = access.getBlock(x, y, z);
		return block == ModBlocks.infusedObsidian || block == ModBlocks.dislocatorReceptacle;
	}
}
