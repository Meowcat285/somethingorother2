//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.10.2020 - 12:47:57
// Last changed on: 18.10.2020 - 12:47:57

package com.jcirmodelsquad.tcjcir.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMILWSwitchStandOff extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMILWSwitchStandOff() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 21
		bodyModel[25] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 113, 17, textureX, textureY, "lamp"); // Box Glow
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "lamp"); // Box Glow
		bodyModel[29] = new ModelRendererTurbo(this, 9, 33, textureX, textureY, "lamp"); // Box Glow
		bodyModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY, "lamp"); // Box Glow
		bodyModel[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34

		bodyModel[0].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 9F, -5F);

		bodyModel[1].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(-27F, 9F, 2F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(1F, -7F, -3F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 3
		bodyModel[3].setRotationPoint(1F, 5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[4].setRotationPoint(1F, 6F, 2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[5].setRotationPoint(1F, 6F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[6].setRotationPoint(2F, 4F, -3F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 3
		bodyModel[7].setRotationPoint(1F, -3F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 3
		bodyModel[8].setRotationPoint(1F, -3F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[9].setRotationPoint(1F, 4F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 3
		bodyModel[10].setRotationPoint(0.5F, -4F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 2
		bodyModel[11].setRotationPoint(2F, -6F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[12].setRotationPoint(1.5F, -5F, -1F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 3
		bodyModel[13].setRotationPoint(0F, -5F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(3F, -6F, -0.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 15
		bodyModel[15].setRotationPoint(4F, -4F, -0.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 3
		bodyModel[16].setRotationPoint(0.5F, -4F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 2
		bodyModel[17].setRotationPoint(2F, 6F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 2
		bodyModel[18].setRotationPoint(1F, 8.5F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(1F, 9F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[20].setRotationPoint(1F, 7.5F, -0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(0.5F, -17F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[22].setRotationPoint(1.5F, -17F, -3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 2
		bodyModel[23].setRotationPoint(1F, -19F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 21
		bodyModel[24].setRotationPoint(0.5F, -17F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(0.5F, -17F, -6F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 2
		bodyModel[26].setRotationPoint(0.5F, -22F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box Glow
		bodyModel[27].setRotationPoint(0F, -21.5F, -3.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box Glow
		bodyModel[28].setRotationPoint(0.5F, -21.5F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box Glow
		bodyModel[29].setRotationPoint(0.5F, -21.5F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box Glow
		bodyModel[30].setRotationPoint(2F, -21.5F, -3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 32
		bodyModel[31].setRotationPoint(1F, -23F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F); // Box 2
		bodyModel[32].setRotationPoint(0.5F, -23F, -3.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34
		bodyModel[33].setRotationPoint(-25F, 9F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-11F, 9F, -0.5F);
	}


	/*@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 35; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}*/
}