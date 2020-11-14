package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftTurnTCTrack extends ModelBase {
	private IModelCustom modelMediumLeftTurn;
	private IModelCustom modelLargeLeftTurn;
	private IModelCustom modelVeryLargeLeftTurn;

	public ModelLeftTurnTCTrack() {
		modelMediumLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_medium.obj"));
		modelLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_big.obj"));
		modelVeryLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_very_big.obj"));
	}

	public void renderMedium() {
		modelMediumLeftTurn.renderAll();
	}
	public void renderLarge() {
		modelLargeLeftTurn.renderAll();
	}
	public void renderVeryLarge() {
		modelVeryLargeLeftTurn.renderAll();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 1.5f, (float) y, (float) z + 5.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);

		if (facing == 3) {
			GL11.glRotatef(-90, 0, 1, 0);
			if(type.equals("very_large"))
				GL11.glTranslatef(-5.5f, 0.0f, 1.54f);
			if(type.equals("large"))
				GL11.glTranslatef(-10.0f, 0.0f, 2.0f);
			if(type.equals("medium"))
				GL11.glTranslatef(-8.0f, 0.0f, 2.0f);
		}
		if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
			if(type.equals("very_large"))
				GL11.glTranslatef(4.5f, 0.0f, -0.455f);
			if(type.equals("large"))
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			if(type.equals("medium"))
				GL11.glTranslatef(2.0f, 0.0f, 0.0f);
		}
		if(facing == 2){
			if(type.equals("very_large"))
				GL11.glTranslatef(-1.5f, 0.0f, -4.469f);
			if(type.equals("large"))
				GL11.glTranslatef(-6.0f, 0.0f, -4.0f);
			if(type.equals("medium"))
				GL11.glTranslatef(-4.0f, 0.0f, -4.0f);
		}
		if(facing == 0){
			GL11.glRotatef(180, 0, 1, 0);
			if(type.equals("very_large"))
				GL11.glTranslatef(0.5f, 0.0f, 5.54f);
			if(type.equals("large"))
				GL11.glTranslatef(-4.0f, 0.0f, 6.0f);
			if(type.equals("medium"))
				GL11.glTranslatef(-2.0f, 0.0f, 6.0f);
		}

		if(type.equals("medium"))this.renderMedium();
		if(type.equals("large"))this.renderLarge();
		if(type.equals("very_large"))this.renderVeryLarge();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
