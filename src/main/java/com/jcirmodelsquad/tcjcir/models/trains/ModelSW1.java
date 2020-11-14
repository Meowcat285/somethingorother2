//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:27.04.2020 - 07:08:26
// Last changed on: 27.04.2020 - 07:08:26

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBluntTruck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeASmol;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSW1 extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelSW1() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[200];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
        bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 6
        bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
        bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 8
        bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 9
        bodyModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 10
        bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 11
        bodyModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 13
        bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
        bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 15
        bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
        bodyModel[13] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 17
        bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
        bodyModel[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 19
        bodyModel[16] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 20
        bodyModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 21
        bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
        bodyModel[19] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 35
        bodyModel[20] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 36
        bodyModel[21] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38
        bodyModel[22] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
        bodyModel[23] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 41
        bodyModel[24] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 42
        bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
        bodyModel[26] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 47
        bodyModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 50 OPTIONAL
        bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 52
        bodyModel[29] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 53
        bodyModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 54 OPTIONAL
        bodyModel[31] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 55 OPTIONAL
        bodyModel[32] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 58
        bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
        bodyModel[34] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 67
        bodyModel[35] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 68
        bodyModel[36] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 71
        bodyModel[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 61
        bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 67
        bodyModel[39] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 70
        bodyModel[40] = new ModelRendererTurbo(this, 393, 1, textureX, textureY, "lamp"); // Box 71 glow
        bodyModel[41] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 72
        bodyModel[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 73
        bodyModel[43] = new ModelRendererTurbo(this, 137, 17, textureX, textureY, "lamp"); // Box 78 glow
        bodyModel[44] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 83
        bodyModel[45] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 84
        bodyModel[46] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 85
        bodyModel[47] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 86
        bodyModel[48] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 87
        bodyModel[49] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 88
        bodyModel[50] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 89
        bodyModel[51] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 102
        bodyModel[52] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 104
        bodyModel[53] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 107
        bodyModel[54] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 108
        bodyModel[55] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 114
        bodyModel[56] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 74
        bodyModel[57] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
        bodyModel[58] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 113
        bodyModel[59] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 114
        bodyModel[60] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 115
        bodyModel[61] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 116
        bodyModel[62] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 117
        bodyModel[63] = new ModelRendererTurbo(this, 489, 17, textureX, textureY, "lamp"); // Box 211 lamp
        bodyModel[64] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 212
        bodyModel[65] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 213
        bodyModel[66] = new ModelRendererTurbo(this, 145, 25, textureX, textureY, "lamp"); // Box 214 lamp
        bodyModel[67] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 126 liveryimg 1
        bodyModel[68] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 127 liveryimg 1
        bodyModel[69] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 128 liveryimg 2
        bodyModel[70] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 129 liveryimg 2
        bodyModel[71] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 126
        bodyModel[72] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 127
        bodyModel[73] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 128
        bodyModel[74] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 129
        bodyModel[75] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 130
        bodyModel[76] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 131
        bodyModel[77] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 132
        bodyModel[78] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 133
        bodyModel[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 134
        bodyModel[80] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 135
        bodyModel[81] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 136
        bodyModel[82] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 137
        bodyModel[83] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 138
        bodyModel[84] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 139
        bodyModel[85] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 140
        bodyModel[86] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 141
        bodyModel[87] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 142
        bodyModel[88] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 143
        bodyModel[89] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 144
        bodyModel[90] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 2
        bodyModel[91] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 146
        bodyModel[92] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 147
        bodyModel[93] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 148
        bodyModel[94] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 315 door swing right
        bodyModel[95] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 151
        bodyModel[96] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 152
        bodyModel[97] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 153
        bodyModel[98] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 154
        bodyModel[99] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 161
        bodyModel[100] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 162
        bodyModel[101] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 163
        bodyModel[102] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 164
        bodyModel[103] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 166
        bodyModel[104] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 167
        bodyModel[105] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 168
        bodyModel[106] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 169
        bodyModel[107] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 170
        bodyModel[108] = new ModelRendererTurbo(this, 257, 33, textureX, textureY, "lamp"); // Box 171 lamp
        bodyModel[109] = new ModelRendererTurbo(this, 369, 33, textureX, textureY, "lamp"); // Box 172 lamp
        bodyModel[110] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 173
        bodyModel[111] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 174
        bodyModel[112] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 175
        bodyModel[113] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 176
        bodyModel[114] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 177
        bodyModel[115] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 178
        bodyModel[116] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 179
        bodyModel[117] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 180
        bodyModel[118] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 181
        bodyModel[119] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 182
        bodyModel[120] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 183
        bodyModel[121] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 184
        bodyModel[122] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 131
        bodyModel[123] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 187
        bodyModel[124] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 188
        bodyModel[125] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 189
        bodyModel[126] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 190
        bodyModel[127] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 191
        bodyModel[128] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 192
        bodyModel[129] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 193
        bodyModel[130] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 194
        bodyModel[131] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 195
        bodyModel[132] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 196
        bodyModel[133] = new ModelRendererTurbo(this, 401, 49, textureX, textureY, "lamp"); // Box 197 lamp
        bodyModel[134] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 198
        bodyModel[135] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 199
        bodyModel[136] = new ModelRendererTurbo(this, 449, 49, textureX, textureY, "lamp"); // Box 200 lamp
        bodyModel[137] = new ModelRendererTurbo(this, 465, 49, textureX, textureY, "lamp"); // Box 137 lamp
        bodyModel[138] = new ModelRendererTurbo(this, 25, 57, textureX, textureY, "lamp"); // Box 138 lamp
        bodyModel[139] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 140
        bodyModel[140] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 141
        bodyModel[141] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 142
        bodyModel[142] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 143
        bodyModel[143] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
        bodyModel[144] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 145
        bodyModel[145] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 146
        bodyModel[146] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 147
        bodyModel[147] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 148
        bodyModel[148] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 148
        bodyModel[149] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 149
        bodyModel[150] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 150
        bodyModel[151] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 151
        bodyModel[152] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 152
        bodyModel[153] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 153
        bodyModel[154] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 154
        bodyModel[155] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 155
        bodyModel[156] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 156
        bodyModel[157] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 157
        bodyModel[158] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 158
        bodyModel[159] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 159
        bodyModel[160] = new ModelRendererTurbo(this, 145, 25, textureX, textureY, "lamp"); // Box 160 lamp
        bodyModel[161] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 161
        bodyModel[162] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 162
        bodyModel[163] = new ModelRendererTurbo(this, 489, 17, textureX, textureY, "lamp"); // Box 163 lamp
        bodyModel[164] = new ModelRendererTurbo(this, 409, 4, textureX, textureY); // Box 164
        bodyModel[165] = new ModelRendererTurbo(this, 356, 4, textureX, textureY); // Box 165
        bodyModel[166] = new ModelRendererTurbo(this, 361, 4, textureX, textureY); // Box 166
        bodyModel[167] = new ModelRendererTurbo(this, 383, 36, textureX, textureY, "lamp"); // Box 167 liveryimg 2 glow
        bodyModel[168] = new ModelRendererTurbo(this, 400, 36, textureX, textureY, "lamp"); // Box 168 liveryimg 2 glow
        bodyModel[169] = new ModelRendererTurbo(this, 475, 47, textureX, textureY, "lamp"); // Box 169 lamp
        bodyModel[170] = new ModelRendererTurbo(this, 437, 34, textureX, textureY, "lamp"); // Box 170 lamp
        bodyModel[171] = new ModelRendererTurbo(this, 59, 69, textureX, textureY); // Box 171
        bodyModel[172] = new ModelRendererTurbo(this, 56, 69, textureX, textureY); // Box 172
        bodyModel[173] = new ModelRendererTurbo(this, 56, 69, textureX, textureY); // Box 173
        bodyModel[174] = new ModelRendererTurbo(this, 77, 67, textureX, textureY); // Box 174
        bodyModel[175] = new ModelRendererTurbo(this, 505, 74, textureX, textureY, "lamp"); // Box 162 glow
        bodyModel[176] = new ModelRendererTurbo(this, 505, 69, textureX, textureY); // Box 165
        bodyModel[177] = new ModelRendererTurbo(this, 499, 74, textureX, textureY, "lamp"); // Box 185 glow
        bodyModel[178] = new ModelRendererTurbo(this, 497, 69, textureX, textureY); // Box 186
        bodyModel[179] = new ModelRendererTurbo(this, 394, 36, textureX, textureY, "lamp"); // Box 179 liveryimg 2 glow
        bodyModel[180] = new ModelRendererTurbo(this, 389, 36, textureX, textureY, "lamp"); // Box 180 liveryimg 2 glow
        bodyModel[181] = new ModelRendererTurbo(this, 2, 53, textureX, textureY); // Box 181
        bodyModel[182] = new ModelRendererTurbo(this, 11, 53, textureX, textureY); // Box 182
        bodyModel[183] = new ModelRendererTurbo(this, 13, 44, textureX, textureY); // Box 183
        bodyModel[184] = new ModelRendererTurbo(this, 19, 53, textureX, textureY); // Box 184
        bodyModel[185] = new ModelRendererTurbo(this, 181, 43, textureX, textureY); // Box 185
        bodyModel[186] = new ModelRendererTurbo(this, 197, 43, textureX, textureY); // Box 186
        bodyModel[187] = new ModelRendererTurbo(this, 209, 43, textureX, textureY); // Box 187
        bodyModel[188] = new ModelRendererTurbo(this, 191, 43, textureX, textureY); // Box 188
        bodyModel[189] = new ModelRendererTurbo(this, 203, 43, textureX, textureY); // Box 189
        bodyModel[190] = new ModelRendererTurbo(this, 212, 43, textureX, textureY); // Box 190
        bodyModel[191] = new ModelRendererTurbo(this, 91, 68, textureX, textureY); // Box 191 skirt
        bodyModel[192] = new ModelRendererTurbo(this, 91, 70, textureX, textureY); // Box 192
        bodyModel[193] = new ModelRendererTurbo(this, 55, 35, textureX, textureY, "cull"); // Box 193 stacc
        bodyModel[194] = new ModelRendererTurbo(this, 62, 35, textureX, textureY, "cull"); // Box 194 stacc
        bodyModel[195] = new ModelRendererTurbo(this, 25, 53, textureX, textureY); // Box 195
        bodyModel[196] = new ModelRendererTurbo(this, 61, 53, textureX, textureY); // Box 196
        bodyModel[197] = new ModelRendererTurbo(this, 35, 53, textureX, textureY); // Box 197
        bodyModel[198] = new ModelRendererTurbo(this, 53, 53, textureX, textureY); // Box 198
        bodyModel[199] = new ModelRendererTurbo(this, 45, 53, textureX, textureY); // Box 199

        bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
        bodyModel[0].setRotationPoint(-22F, -2F, -11F);

        bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 1
        bodyModel[1].setRotationPoint(-25F, -2F, -7F);

        bodyModel[2].addBox(0F, 0F, 0F, 25, 15, 14, 0F); // Box 5
        bodyModel[2].setRotationPoint(-18F, -17F, -7F);

        bodyModel[3].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 6
        bodyModel[3].setRotationPoint(15F, -21F, -11F);

        bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 6, 0F); // Box 7
        bodyModel[4].setRotationPoint(14F, -25F, -3F);

        bodyModel[5].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 8
        bodyModel[5].setRotationPoint(15F, -21F, 10F);

        bodyModel[6].addBox(0F, 0F, 0F, 1, 15, 7, 0F); // Box 9
        bodyModel[6].setRotationPoint(25F, -21F, -10F);

        bodyModel[7].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 10
        bodyModel[7].setRotationPoint(14F, -21F, -7F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 11
        bodyModel[8].setRotationPoint(14F, -23F, -9F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[9].setRotationPoint(14F, -25F, -9F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[10].setRotationPoint(14F, -23F, -11F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[11].setRotationPoint(14F, -23F, 9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[12].setRotationPoint(14F, -25F, 3F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[13].setRotationPoint(7F, -17F, -7F);

        bodyModel[14].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 18
        bodyModel[14].setRotationPoint(14F, -6F, -11F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[15].setRotationPoint(-18F, -18F, -7F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        bodyModel[16].setRotationPoint(-18F, -18F, 0F);

        bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 21
        bodyModel[17].setRotationPoint(-22F, -6F, -7F);

        bodyModel[18].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 33
        bodyModel[18].setRotationPoint(3F, -24F, -1F);

        bodyModel[19].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 35
        bodyModel[19].setRotationPoint(-21F, -10F, -11.01F);

        bodyModel[20].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 36
        bodyModel[20].setRotationPoint(-21F, -10F, 11.01F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
        bodyModel[21].setRotationPoint(-23F, -10F, -11.01F);

        bodyModel[22].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 40
        bodyModel[22].setRotationPoint(-23F, -8F, -11.01F);

        bodyModel[23].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 41
        bodyModel[23].setRotationPoint(-23F, -8F, 11.01F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 42
        bodyModel[24].setRotationPoint(-23F, -10F, 11.01F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
        bodyModel[25].setRotationPoint(12F, -5F, -11F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 47
        bodyModel[26].setRotationPoint(7F, -17F, 0F);

        bodyModel[27].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 50 OPTIONAL
        bodyModel[27].setRotationPoint(-28F, 5F, -11F);

        bodyModel[28].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
        bodyModel[28].setRotationPoint(-28.5F, 0F, -1.5F);

        bodyModel[29].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
        bodyModel[29].setRotationPoint(35.5F, 0F, -1.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54 OPTIONAL
        bodyModel[30].setRotationPoint(15F, -21F, -12F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55 OPTIONAL
        bodyModel[31].setRotationPoint(15F, -20F, 11F);

        bodyModel[32].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 58
        bodyModel[32].setRotationPoint(-22F, 5F, -9F);
        bodyModel[32].rotateAngleY = -3.14159265F;

        bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 59
        bodyModel[33].setRotationPoint(-22F, 3F, -7.5F);
        bodyModel[33].rotateAngleY = -3.14159265F;

        bodyModel[34].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 67
        bodyModel[34].setRotationPoint(28F, -10F, -4F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 68
        bodyModel[35].setRotationPoint(28F, -10F, 4F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 15, 7, 0F); // Box 71
        bodyModel[36].setRotationPoint(25F, -21F, 3F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
        bodyModel[37].setRotationPoint(25F, -21F, -3F);

        bodyModel[38].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
        bodyModel[38].setRotationPoint(13F, -14.98F, -1.5F);
        bodyModel[38].rotateAngleY = -0.48869219F;

        bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
        bodyModel[39].setRotationPoint(15F, -15F, 3F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow
        bodyModel[40].setRotationPoint(15F, -23F, -1F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 72
        bodyModel[41].setRotationPoint(13F, -24F, -0.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 73
        bodyModel[42].setRotationPoint(12F, -24F, -0.5F);

        bodyModel[43].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 glow
        bodyModel[43].setRotationPoint(20F, -23.5F, -1F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        bodyModel[44].setRotationPoint(0.5F, 1F, -11F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
        bodyModel[45].setRotationPoint(0.5F, 3F, -11F);

        bodyModel[46].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 85
        bodyModel[46].setRotationPoint(0.5F, 2F, -11F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        bodyModel[47].setRotationPoint(0.5F, 1F, 8F);

        bodyModel[48].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 87
        bodyModel[48].setRotationPoint(0.5F, 2F, 8F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
        bodyModel[49].setRotationPoint(0.5F, 3F, 8F);

        bodyModel[50].addBox(0F, 0F, 0F, 10, 5, 16, 0F); // Box 89
        bodyModel[50].setRotationPoint(0F, 0F, -8F);

        bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 102
        bodyModel[51].setRotationPoint(-15F, 0F, -1F);

        bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
        bodyModel[52].setRotationPoint(20F, 0F, -1F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
        bodyModel[53].setRotationPoint(7F, -15F, -7F);

        bodyModel[54].addBox(0F, 0F, 0F, 54, 1, 16, 0F); // Box 108
        bodyModel[54].setRotationPoint(-22F, -1F, -8F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
        bodyModel[55].setRotationPoint(-16F, -21F, -0.5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[56].setRotationPoint(-16F, -22F, -0.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
        bodyModel[57].setRotationPoint(-15.75F, -20.5F, -0.25F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
        bodyModel[58].setRotationPoint(-16F, -19F, -2F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
        bodyModel[59].setRotationPoint(-16F, -22F, -2F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[60].setRotationPoint(-16F, -22F, 1F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
        bodyModel[61].setRotationPoint(-16F, -22.5F, -1F);

        bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
        bodyModel[62].setRotationPoint(-16F, -18.5F, -1F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 211 lamp
        bodyModel[63].setRotationPoint(-25.5F, -4F, 5.25F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
        bodyModel[64].setRotationPoint(-25F, -4F, 5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
        bodyModel[65].setRotationPoint(-25F, -4F, -7F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 214 lamp
        bodyModel[66].setRotationPoint(-25.5F, -4F, -6.75F);

        bodyModel[67].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 126 liveryimg 1
        bodyModel[67].setRotationPoint(-16F, -14F, -7.01F);

        bodyModel[68].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 127 liveryimg 1
        bodyModel[68].setRotationPoint(-16F, -14F, 7.01F);

        bodyModel[69].addBox(0F, 0F, 0F, 11, 5, 0, 0F); // Box 128 liveryimg 2
        bodyModel[69].setRotationPoint(15F, -14F, -11.01F);

        bodyModel[70].addBox(0F, 0F, 0F, 11, 5, 0, 0F); // Box 129 liveryimg 2
        bodyModel[70].setRotationPoint(15F, -14F, 11.01F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
        bodyModel[71].setRotationPoint(15F, -23F, 6F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 127
        bodyModel[72].setRotationPoint(15F, -23F, -9F);

        bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 128
        bodyModel[73].setRotationPoint(-21F, -7F, -7F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[74].setRotationPoint(13F, -25F, -9F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 130
        bodyModel[75].setRotationPoint(13F, -25F, 3F);

        bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 131
        bodyModel[76].setRotationPoint(13F, -25F, -3F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
        bodyModel[77].setRotationPoint(13F, -23F, -11F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 133
        bodyModel[78].setRotationPoint(13F, -23F, 9F);

        bodyModel[79].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 134
        bodyModel[79].setRotationPoint(-22F, 1F, -5F);
        bodyModel[79].rotateAngleY = -3.14159265F;

        bodyModel[80].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 135
        bodyModel[80].setRotationPoint(-22F, -1F, -11F);

        bodyModel[81].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 136
        bodyModel[81].setRotationPoint(-22F, -1F, 5F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        bodyModel[82].setRotationPoint(-22F, -7F, -7F);

        bodyModel[83].addBox(0F, 0F, 0F, 1, 7, 13, 0F); // Box 138
        bodyModel[83].setRotationPoint(-18.5F, -14.5F, -6.5F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        bodyModel[84].setRotationPoint(26F, -25F, -9F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[85].setRotationPoint(26F, -23F, -11F);

        bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 141
        bodyModel[86].setRotationPoint(26F, -25F, -3F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 142
        bodyModel[87].setRotationPoint(26F, -25F, 3F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 143
        bodyModel[88].setRotationPoint(26F, -23F, 9F);

        bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 144
        bodyModel[89].setRotationPoint(25F, -23F, -9F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        bodyModel[90].setRotationPoint(-26F, -0.5F, -2F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        bodyModel[91].setRotationPoint(35F, -0.5F, -2F);

        bodyModel[92].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 147
        bodyModel[92].setRotationPoint(-20F, -18F, -1.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[93].setRotationPoint(-19.5F, -17.5F, -2.5F);

        bodyModel[94].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 315 door swing right
        bodyModel[94].setRotationPoint(14.5F, -21F, -10.5F);

        bodyModel[95].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 151
        bodyModel[95].setRotationPoint(-22F, -1F, -11F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 152
        bodyModel[96].setRotationPoint(-21F, 0F, -11F);

        bodyModel[97].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 153
        bodyModel[97].setRotationPoint(-21F, -1F, -11F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[98].setRotationPoint(-19F, -1F, -11F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 161
        bodyModel[99].setRotationPoint(0F, -1F, -10F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 162
        bodyModel[100].setRotationPoint(0F, -1F, 8F);

        bodyModel[101].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 163
        bodyModel[101].setRotationPoint(32F, -1F, -11F);

        bodyModel[102].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 164
        bodyModel[102].setRotationPoint(32F, -1F, 5F);

        bodyModel[103].addBox(0F, 0F, 0F, 0, 14, 20, 0F); // Box 166
        bodyModel[103].setRotationPoint(-25.01F, -10F, -10F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
        bodyModel[104].setRotationPoint(-25.01F, -10F, -11F);

        bodyModel[105].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 168
        bodyModel[105].setRotationPoint(-25.01F, -9F, -11F);

        bodyModel[106].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 169
        bodyModel[106].setRotationPoint(-25.01F, -9F, 10F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        bodyModel[107].setRotationPoint(-25.01F, -10F, 10F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 171 lamp
        bodyModel[108].setRotationPoint(-20.5F, -18.25F, -0.75F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 172 lamp
        bodyModel[109].setRotationPoint(-20.5F, -16.25F, -0.75F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
        bodyModel[110].setRotationPoint(-19.5F, -17.5F, 1.5F);

        bodyModel[111].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 174
        bodyModel[111].setRotationPoint(-25.01F, 4F, -11F);

        bodyModel[112].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 175
        bodyModel[112].setRotationPoint(-28F, 5F, 4F);

        bodyModel[113].addBox(0F, 0F, 0F, 0, 14, 20, 0F); // Box 176
        bodyModel[113].setRotationPoint(35.01F, -10F, -10F);

        bodyModel[114].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 177
        bodyModel[114].setRotationPoint(35.01F, 4F, -11F);

        bodyModel[115].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 178
        bodyModel[115].setRotationPoint(35.01F, 5F, 4F);

        bodyModel[116].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 179
        bodyModel[116].setRotationPoint(35.01F, 5F, -11F);

        bodyModel[117].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
        bodyModel[117].setRotationPoint(35.01F, -9F, -11F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        bodyModel[118].setRotationPoint(35.01F, -10F, 10F);

        bodyModel[119].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 182
        bodyModel[119].setRotationPoint(35.01F, -9F, 10F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[120].setRotationPoint(35.01F, -10F, -11F);

        bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 184
        bodyModel[121].setRotationPoint(32F, -2F, -7F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[122].setRotationPoint(29F, -16F, -4F);
        bodyModel[122].rotateAngleY = -3.14159265F;

        bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[123].setRotationPoint(29F, -16F, 4F);
        bodyModel[123].rotateAngleY = -3.14159265F;

        bodyModel[124].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 188
        bodyModel[124].setRotationPoint(32F, -8F, -11.01F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 189
        bodyModel[125].setRotationPoint(31F, -10F, -11.01F);

        bodyModel[126].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 190
        bodyModel[126].setRotationPoint(32F, -8F, 11.01F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
        bodyModel[127].setRotationPoint(31F, -10F, 11.01F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 192
        bodyModel[128].setRotationPoint(29F, -10F, -11.01F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 193
        bodyModel[129].setRotationPoint(29F, -10F, 11.01F);

        bodyModel[130].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 194
        bodyModel[130].setRotationPoint(29F, -8F, -11.01F);

        bodyModel[131].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 195
        bodyModel[131].setRotationPoint(29F, -8F, 11.01F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
        bodyModel[132].setRotationPoint(25.5F, -23.5F, -2.5F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 197 lamp
        bodyModel[133].setRotationPoint(26.5F, -22.25F, -0.75F);

        bodyModel[134].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 198
        bodyModel[134].setRotationPoint(26F, -24F, -1.5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 199
        bodyModel[135].setRotationPoint(25.5F, -23.5F, 1.5F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 200 lamp
        bodyModel[136].setRotationPoint(26.5F, -24.25F, -0.75F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 137 lamp
        bodyModel[137].setRotationPoint(-20.25F, -17.25F, -0.75F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 138 lamp
        bodyModel[138].setRotationPoint(26.25F, -23.25F, -0.75F);

        bodyModel[139].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 140
        bodyModel[139].setRotationPoint(35F, 5F, -9F);
        bodyModel[139].rotateAngleY = -3.14159265F;

        bodyModel[140].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 141
        bodyModel[140].setRotationPoint(35F, 3F, -7.5F);
        bodyModel[140].rotateAngleY = -3.14159265F;

        bodyModel[141].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 142
        bodyModel[141].setRotationPoint(35F, 1F, -5F);
        bodyModel[141].rotateAngleY = -3.14159265F;

        bodyModel[142].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 143
        bodyModel[142].setRotationPoint(32F, 5F, 9F);

        bodyModel[143].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 144
        bodyModel[143].setRotationPoint(32F, 3F, 7.5F);

        bodyModel[144].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 145
        bodyModel[144].setRotationPoint(32F, 1F, 5F);

        bodyModel[145].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 146
        bodyModel[145].setRotationPoint(-25F, 1F, 5F);

        bodyModel[146].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 147
        bodyModel[146].setRotationPoint(-25F, 3F, 7.5F);

        bodyModel[147].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 148
        bodyModel[147].setRotationPoint(-25F, 5F, 9F);

        bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
        bodyModel[148].setRotationPoint(-21F, -1F, 11F);

        bodyModel[149].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
        bodyModel[149].setRotationPoint(-22F, -1F, 11F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 150
        bodyModel[150].setRotationPoint(-21F, 0F, 11F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[151].setRotationPoint(-19F, -1F, 11F);

        bodyModel[152].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 152
        bodyModel[152].setRotationPoint(29F, -1F, 11F);

        bodyModel[153].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 153
        bodyModel[153].setRotationPoint(31F, -1F, 11F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 154
        bodyModel[154].setRotationPoint(29F, 0F, 11F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
        bodyModel[155].setRotationPoint(28F, -1F, 11F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 156
        bodyModel[156].setRotationPoint(28F, -1F, -11F);

        bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 157
        bodyModel[157].setRotationPoint(29F, -1F, -11F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 158
        bodyModel[158].setRotationPoint(29F, 0F, -11F);

        bodyModel[159].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 159
        bodyModel[159].setRotationPoint(31F, -1F, -11F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 160 lamp
        bodyModel[160].setRotationPoint(36F, -4F, -5.25F);
        bodyModel[160].rotateAngleY = -3.14159265F;

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
        bodyModel[161].setRotationPoint(35.5F, -4F, -5F);
        bodyModel[161].rotateAngleY = -3.14159265F;

        bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
        bodyModel[162].setRotationPoint(35.5F, -4F, 7F);
        bodyModel[162].rotateAngleY = -3.14159265F;

        bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 163 lamp
        bodyModel[163].setRotationPoint(36F, -4F, 6.75F);
        bodyModel[163].rotateAngleY = -3.14159265F;

        bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
        bodyModel[164].setRotationPoint(12F, -26F, -0.5F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
        bodyModel[165].setRotationPoint(13F, -26F, -0.5F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
        bodyModel[166].setRotationPoint(14F, -26F, -0.5F);

        bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 167 liveryimg 2 glow
        bodyModel[167].setRotationPoint(-19.5F, -17F, -1.5F);
        bodyModel[167].rotateAngleY = -0.4712389F;

        bodyModel[168].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 168 liveryimg 2 glow
        bodyModel[168].setRotationPoint(-19.5F, -17F, 1.5F);
        bodyModel[168].rotateAngleY = 0.4712389F;

        bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 lamp
        bodyModel[169].setRotationPoint(-20.25F, -17.75F, -1.25F);

        bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170 lamp
        bodyModel[170].setRotationPoint(26.75F, -23.75F, -1.25F);

        bodyModel[171].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 171
        bodyModel[171].setRotationPoint(-1F, -22F, -1.5F);

        bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 172
        bodyModel[172].setRotationPoint(-1F, -19.5F, -1.5F);

        bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 173
        bodyModel[173].setRotationPoint(-1F, -19.5F, 1.5F);

        bodyModel[174].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
        bodyModel[174].setRotationPoint(-1F, -23F, -1.5F);

        bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glow
        bodyModel[175].setRotationPoint(14.5F, -27F, -0.5F);

        bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
        bodyModel[176].setRotationPoint(14.65F, -26F, -0.5F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185 glow
        bodyModel[177].setRotationPoint(24.5F, -27F, -0.5F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 186
        bodyModel[178].setRotationPoint(24.65F, -26F, -0.5F);

        bodyModel[179].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 179 liveryimg 2 glow
        bodyModel[179].setRotationPoint(27.5F, -23F, -1.5F);
        bodyModel[179].rotateAngleY = -2.67035376F;

        bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 180 liveryimg 2 glow
        bodyModel[180].setRotationPoint(27.5F, -23F, 1.5F);
        bodyModel[180].rotateAngleY = 2.67035376F;

        bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 181
        bodyModel[181].setRotationPoint(12F, -25F, -7F);

        bodyModel[182].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 182
        bodyModel[182].setRotationPoint(12.5F, -24.5F, -8F);

        bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[183].setRotationPoint(14F, -26F, 0F);

        bodyModel[184].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
        bodyModel[184].setRotationPoint(23F, -27F, 0F);

        bodyModel[185].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 185
        bodyModel[185].setRotationPoint(-27F, 5F, -2F);

        bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[186].setRotationPoint(-27F, 3F, -2F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[187].setRotationPoint(-27F, 3F, 2F);

        bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
        bodyModel[188].setRotationPoint(35F, 3F, 2F);

        bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        bodyModel[189].setRotationPoint(35F, 3F, -2F);

        bodyModel[190].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 190
        bodyModel[190].setRotationPoint(35F, 5F, -2F);

        bodyModel[191].addBox(0F, 0F, 0F, 48, 1, 0, 0F); // Box 191 skirt
        bodyModel[191].setRotationPoint(-19F, -1F, 11F);

        bodyModel[192].addBox(0F, 0F, 0F, 48, 1, 0, 0F); // Box 192
        bodyModel[192].setRotationPoint(-19F, -1F, -11F);

        bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193 stacc
        bodyModel[193].setRotationPoint(3F, -26F, -1F);

        bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194 stacc
        bodyModel[194].setRotationPoint(3F, -26F, 0F);

        bodyModel[195].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
        bodyModel[195].setRotationPoint(12F, -27F, -0.5F);

        bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
        bodyModel[196].setRotationPoint(12.5F, -26.75F, -1.5F);

        bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
        bodyModel[197].setRotationPoint(12.5F, -26.75F, 0.5F);

        bodyModel[198].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 198
        bodyModel[198].setRotationPoint(13F, -26.5F, 1.5F);

        bodyModel[199].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 199
        bodyModel[199].setRotationPoint(13F, -26.5F, -2.5F);
    }

    ModelTypeASmol theTrucks1 = new ModelTypeASmol();
    ModelBluntTruck theTrucks2 = new ModelBluntTruck();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 200; i++) {
            if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bodyModel[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            } else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bodyModel[i].render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            } else {
                bodyModel[i].render(f5);
            }

        }
        if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Brown.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-0.6, 0.04, 0);
            theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glRotatef(180, 0, 1, 0);
            GL11.glTranslated(-1.83, 0.0, 0);
            theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();

        } else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4) { //this is for the emd demo skin to have silver trucks eventually
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeasmol_Black.png"));// replace with grey eventually
            GL11.glPushMatrix();
            GL11.glTranslated(-0.6F ,0.05F,0F);
            theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(1.95F,0.0F,0);
            theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeasmol_Black.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-0.6F ,0.05F,0F);
            theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(1.95F,0.0F,0);
            theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo sw1Model[];
}