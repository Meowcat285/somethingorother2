//coom

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.client.Minecraft;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C1;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSD9 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD9() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[340];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 266
		bodyModel[3] = new ModelRendererTurbo(this, 241, 3, textureX, textureY); // Box 143
		bodyModel[4] = new ModelRendererTurbo(this, 297, 3, textureX, textureY); // Box 62
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 78
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 188
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 266
		bodyModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 271
		bodyModel[22] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 272
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 273
		bodyModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 274
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 275
		bodyModel[26] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 271
		bodyModel[27] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 272
		bodyModel[28] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 273
		bodyModel[29] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 274
		bodyModel[30] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 275
		bodyModel[31] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 276
		bodyModel[32] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 5
		bodyModel[33] = new ModelRendererTurbo(this, 425, 3, textureX, textureY); // Box 143
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 61
		bodyModel[35] = new ModelRendererTurbo(this, 505, 3, textureX, textureY); // Box 62
		bodyModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 214
		bodyModel[45] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 209
		bodyModel[46] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 211
		bodyModel[47] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 214
		bodyModel[50] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 215
		bodyModel[51] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 216
		bodyModel[52] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 217
		bodyModel[53] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 218
		bodyModel[54] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 219
		bodyModel[55] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 220
		bodyModel[56] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 221
		bodyModel[57] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 223
		bodyModel[58] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 39
		bodyModel[59] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 119
		bodyModel[60] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 125
		bodyModel[61] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 9
		bodyModel[62] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 10
		bodyModel[63] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 15
		bodyModel[64] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 21
		bodyModel[65] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 314 door swing right
		bodyModel[66] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 315 door swing right
		bodyModel[67] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 344
		bodyModel[68] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 345
		bodyModel[69] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 346
		bodyModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 347
		bodyModel[71] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 348
		bodyModel[72] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 349
		bodyModel[73] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 350
		bodyModel[74] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 351
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 352
		bodyModel[76] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 353
		bodyModel[77] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 265
		bodyModel[78] = new ModelRendererTurbo(this, 449, 1, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[79] = new ModelRendererTurbo(this, 233, 9, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[80] = new ModelRendererTurbo(this, 299, 59, textureX, textureY); // Box 358
		bodyModel[81] = new ModelRendererTurbo(this, 289, 9, textureX, textureY, "lamp"); // Box 359 lamp
		bodyModel[82] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 360
		bodyModel[83] = new ModelRendererTurbo(this, 297, 17, textureX, textureY, "lamp"); // Box 361 lamp
		bodyModel[84] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 362
		bodyModel[85] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 363
		bodyModel[86] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 364
		bodyModel[87] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 365
		bodyModel[88] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 366
		bodyModel[89] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 239
		bodyModel[90] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[91] = new ModelRendererTurbo(this, 409, 17, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[92] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 242
		bodyModel[93] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 371
		bodyModel[94] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 372
		bodyModel[95] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 373
		bodyModel[96] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 374
		bodyModel[97] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 486
		bodyModel[98] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 489
		bodyModel[99] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 38R
		bodyModel[100] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 176
		bodyModel[101] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 243
		bodyModel[102] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 250
		bodyModel[103] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 500
		bodyModel[104] = new ModelRendererTurbo(this, 369, 42, textureX, textureY); // Box 501
		bodyModel[105] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 503
		bodyModel[106] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 131
		bodyModel[107] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 132
		bodyModel[108] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 133
		bodyModel[109] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 134
		bodyModel[110] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 135
		bodyModel[111] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 136
		bodyModel[112] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 137
		bodyModel[113] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 138
		bodyModel[114] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 139
		bodyModel[115] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 140
		bodyModel[116] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 141
		bodyModel[117] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 142
		bodyModel[118] = new ModelRendererTurbo(this, 137, 33, textureX, textureY, "lamp"); // Box 149 lamp
		bodyModel[119] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 150
		bodyModel[120] = new ModelRendererTurbo(this, 177, 33, textureX, textureY, "lamp"); // Box 151 lamp
		bodyModel[121] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 152
		bodyModel[122] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 154
		bodyModel[123] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 155
		bodyModel[124] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 89
		bodyModel[125] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 91
		bodyModel[126] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 101
		bodyModel[127] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 105
		bodyModel[128] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 172
		bodyModel[129] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 173
		bodyModel[130] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 176
		bodyModel[131] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 177
		bodyModel[132] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 178
		bodyModel[133] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 179
		bodyModel[134] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 180
		bodyModel[135] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 181
		bodyModel[136] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 182
		bodyModel[137] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 183
		bodyModel[138] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 184
		bodyModel[139] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 185
		bodyModel[140] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 190
		bodyModel[141] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 191
		bodyModel[142] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 196 winterization hatch
		bodyModel[143] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 202
		bodyModel[144] = new ModelRendererTurbo(this, 385, 33, textureX, textureY, "lamp"); // Box 215 lamp
		bodyModel[145] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 216
		bodyModel[146] = new ModelRendererTurbo(this, 305, 41, textureX, textureY, "lamp"); // Box 217 lamp
		bodyModel[147] = new ModelRendererTurbo(this, 385, 41, textureX, textureY, "lamp"); // Box 218 lamp
		bodyModel[148] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 219
		bodyModel[149] = new ModelRendererTurbo(this, 113, 49, textureX, textureY, "lamp"); // Box 220 lamp
		bodyModel[150] = new ModelRendererTurbo(this, 393, 57, textureX, textureY, "lamp"); // Box 221 lamp
		bodyModel[151] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 222
		bodyModel[152] = new ModelRendererTurbo(this, 505, 73, textureX, textureY, "lamp"); // Box 223 lamp
		bodyModel[153] = new ModelRendererTurbo(this, 1, 81, textureX, textureY, "lamp"); // Box 224 lamp
		bodyModel[154] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 225
		bodyModel[155] = new ModelRendererTurbo(this, 121, 81, textureX, textureY, "lamp"); // Box 226 lamp
		bodyModel[156] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 237
		bodyModel[157] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 238
		bodyModel[158] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 247 extra stack
		bodyModel[159] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 248 extra stack
		bodyModel[160] = new ModelRendererTurbo(this, 265, 90, textureX, textureY); // Box 272
		bodyModel[161] = new ModelRendererTurbo(this, 386, 90, textureX, textureY); // Box 86
		bodyModel[162] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 278
		bodyModel[163] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 279
		bodyModel[164] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 280
		bodyModel[165] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 281
		bodyModel[166] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 283
		bodyModel[167] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 285
		bodyModel[168] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 286
		bodyModel[169] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 287
		bodyModel[170] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 288
		bodyModel[171] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 289
		bodyModel[172] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 290
		bodyModel[173] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 291
		bodyModel[174] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 292
		bodyModel[175] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 293
		bodyModel[176] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 294
		bodyModel[177] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 295
		bodyModel[178] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 296
		bodyModel[179] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 297
		bodyModel[180] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 298
		bodyModel[181] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 299
		bodyModel[182] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 300
		bodyModel[183] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 301
		bodyModel[184] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 302
		bodyModel[185] = new ModelRendererTurbo(this, 281, 81, textureX, textureY, "lamp"); // Box 303 lamp
		bodyModel[186] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 304
		bodyModel[187] = new ModelRendererTurbo(this, 505, 81, textureX, textureY, "lamp"); // Box 305 lamp
		bodyModel[188] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 306
		bodyModel[189] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 307
		bodyModel[190] = new ModelRendererTurbo(this, 257, 89, textureX, textureY, "lamp"); // Box 308 lamp
		bodyModel[191] = new ModelRendererTurbo(this, 289, 97, textureX, textureY, "lamp"); // Box 309 lamp
		bodyModel[192] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 310
		bodyModel[193] = new ModelRendererTurbo(this, 353, 97, textureX, textureY, "lamp"); // Box 311 lamp
		bodyModel[194] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 312
		bodyModel[195] = new ModelRendererTurbo(this, 441, 97, textureX, textureY, "lamp"); // Box 313 lamp
		bodyModel[196] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 314
		bodyModel[197] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 315
		bodyModel[198] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 316
		bodyModel[199] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 114
		bodyModel[200] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 74
		bodyModel[201] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 78
		bodyModel[202] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 245
		bodyModel[203] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 323
		bodyModel[204] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 324
		bodyModel[205] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 114
		bodyModel[206] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 74
		bodyModel[207] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 78
		bodyModel[208] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 877
		bodyModel[209] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 332
		bodyModel[210] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 333
		bodyModel[211] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 334
		bodyModel[212] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 335
		bodyModel[213] = new ModelRendererTurbo(this, 497, 105, textureX, textureY, "cull"); // Box 336 cull
		bodyModel[214] = new ModelRendererTurbo(this, 89, 121, textureX, textureY, "cull"); // Box 337 cull
		bodyModel[215] = new ModelRendererTurbo(this, 257, 121, textureX, textureY, "cull"); // Box 338 cull
		bodyModel[216] = new ModelRendererTurbo(this, 273, 121, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[217] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 197
		bodyModel[218] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 198
		bodyModel[219] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 199
		bodyModel[220] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 200
		bodyModel[221] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 201
		bodyModel[222] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 345
		bodyModel[223] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 346
		bodyModel[224] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 347
		bodyModel[225] = new ModelRendererTurbo(this, 121, 57, textureX, textureY, "lamp"); // Box 162 rotating lamp?
		bodyModel[226] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 165
		bodyModel[227] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 622
		bodyModel[228] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 638
		bodyModel[229] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 639
		bodyModel[230] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 640
		bodyModel[231] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 74
		bodyModel[232] = new ModelRendererTurbo(this, 313, 105, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[233] = new ModelRendererTurbo(this, 353, 105, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[234] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 644
		bodyModel[235] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 645
		bodyModel[236] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 646
		bodyModel[237] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 647
		bodyModel[238] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 648
		bodyModel[239] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 649
		bodyModel[240] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 240
		bodyModel[241] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 241
		bodyModel[242] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 242
		bodyModel[243] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 243
		bodyModel[244] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 262
		bodyModel[245] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 203
		bodyModel[246] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 204
		bodyModel[247] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 205
		bodyModel[248] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 206
		bodyModel[249] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 267
		bodyModel[250] = new ModelRendererTurbo(this, 441, 73, textureX, textureY, "lamp"); // Box 268 glow
		bodyModel[251] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 269
		bodyModel[252] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 114
		bodyModel[253] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 74
		bodyModel[254] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 75
		bodyModel[255] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 76
		bodyModel[256] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 77
		bodyModel[257] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 78
		bodyModel[258] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 276
		bodyModel[259] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 277
		bodyModel[260] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 278
		bodyModel[261] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 279
		bodyModel[262] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 280
		bodyModel[263] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 281
		bodyModel[264] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 389
		bodyModel[265] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 390
		bodyModel[266] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 391
		bodyModel[267] = new ModelRendererTurbo(this, 449, 113, textureX, textureY, "lamp"); // Box 162 glow
		bodyModel[268] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 165
		bodyModel[269] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 287
		bodyModel[270] = new ModelRendererTurbo(this, 89, 121, textureX, textureY, "lamp"); // Box 288 glow
		bodyModel[271] = new ModelRendererTurbo(this, 31, 140, textureX, textureY); // Box 131
		bodyModel[272] = new ModelRendererTurbo(this, 25, 144, textureX, textureY); // Box 131
		bodyModel[273] = new ModelRendererTurbo(this, 15, 141, textureX, textureY); // Box 131
		bodyModel[274] = new ModelRendererTurbo(this, 12, 129, textureX, textureY); // Box 131
		bodyModel[275] = new ModelRendererTurbo(this, 21, 132, textureX, textureY); // Box 131
		bodyModel[276] = new ModelRendererTurbo(this, 10, 141, textureX, textureY); // Box 131
		bodyModel[277] = new ModelRendererTurbo(this, 20, 142, textureX, textureY); // Box 131
		bodyModel[278] = new ModelRendererTurbo(this, 7, 131, textureX, textureY); // Box 131
		bodyModel[279] = new ModelRendererTurbo(this, 26, 131, textureX, textureY); // Box 131
		bodyModel[280] = new ModelRendererTurbo(this, 18, 127, textureX, textureY); // Box 131
		bodyModel[281] = new ModelRendererTurbo(this, 59, 76, textureX, textureY, "lamp"); // Box 357 glow
		bodyModel[282] = new ModelRendererTurbo(this, 59, 74, textureX, textureY, "lamp"); // Box 357 glow
		bodyModel[283] = new ModelRendererTurbo(this, 59, 72, textureX, textureY, "lamp"); // Box 357 glow
		bodyModel[284] = new ModelRendererTurbo(this, 59, 70, textureX, textureY, "lamp"); // Box 357 glow
		bodyModel[285] = new ModelRendererTurbo(this, 35, 122, textureX, textureY, "lamp"); // Box 363 liveryimg 3 glow
		bodyModel[286] = new ModelRendererTurbo(this, 46, 122, textureX, textureY, "lamp"); // Box 364 liveryimg 3 glow
		bodyModel[287] = new ModelRendererTurbo(this, 57, 122, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[288] = new ModelRendererTurbo(this, 68, 122, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[289] = new ModelRendererTurbo(this, 40, 119, textureX, textureY, "lamp"); // Box 363 liveryimg 3 glow
		bodyModel[290] = new ModelRendererTurbo(this, 51, 119, textureX, textureY, "lamp"); // Box 364 liveryimg 3 glow
		bodyModel[291] = new ModelRendererTurbo(this, 56, 77, textureX, textureY, "lamp"); // Box 357 glow
		bodyModel[292] = new ModelRendererTurbo(this, 53, 77, textureX, textureY, "lamp"); // Box 357 glow
		bodyModel[293] = new ModelRendererTurbo(this, 179, 113, textureX, textureY); // Box 203
		bodyModel[294] = new ModelRendererTurbo(this, 153, 68, textureX, textureY); // Box 204
		bodyModel[295] = new ModelRendererTurbo(this, 348, 38, textureX, textureY); // Box 114
		bodyModel[296] = new ModelRendererTurbo(this, 343, 38, textureX, textureY); // Box 74
		bodyModel[297] = new ModelRendererTurbo(this, 500, 38, textureX, textureY); // Box 78
		bodyModel[298] = new ModelRendererTurbo(this, 293, 11, textureX, textureY); // Box 877
		bodyModel[299] = new ModelRendererTurbo(this, 394, 53, textureX, textureY); // Box 332
		bodyModel[300] = new ModelRendererTurbo(this, 506, 53, textureX, textureY); // Box 333
		bodyModel[301] = new ModelRendererTurbo(this, 497, 100, textureX, textureY); // Box 197
		bodyModel[302] = new ModelRendererTurbo(this, 1, 109, textureX, textureY); // Box 198
		bodyModel[303] = new ModelRendererTurbo(this, 251, 99, textureX, textureY); // Box 199
		bodyModel[304] = new ModelRendererTurbo(this, 497, 94, textureX, textureY); // Box 197
		bodyModel[305] = new ModelRendererTurbo(this, 334, 108, textureX, textureY); // Box 226
		bodyModel[306] = new ModelRendererTurbo(this, 334, 110, textureX, textureY); // Box 321
		bodyModel[307] = new ModelRendererTurbo(this, 217, 131, textureX, textureY); // Box 322
		bodyModel[308] = new ModelRendererTurbo(this, 440, 119, textureX, textureY); // Box 323
		bodyModel[309] = new ModelRendererTurbo(this, 185, 128, textureX, textureY); // Box 324
		bodyModel[310] = new ModelRendererTurbo(this, 461, 119, textureX, textureY); // Box 325
		bodyModel[311] = new ModelRendererTurbo(this, 51, 67, textureX, textureY); // Box 326
		bodyModel[312] = new ModelRendererTurbo(this, 115, 99, textureX, textureY); // Box 327
		bodyModel[313] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 328
		bodyModel[314] = new ModelRendererTurbo(this, 284, 122, textureX, textureY); // Box 330
		bodyModel[315] = new ModelRendererTurbo(this, 284, 122, textureX, textureY); // Box 331
		bodyModel[316] = new ModelRendererTurbo(this, 289, 122, textureX, textureY); // Box 332
		bodyModel[317] = new ModelRendererTurbo(this, 289, 122, textureX, textureY); // Box 333
		bodyModel[318] = new ModelRendererTurbo(this, 347, 9, textureX, textureY); // Box 334
		bodyModel[319] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 335
		bodyModel[320] = new ModelRendererTurbo(this, 52, 131, textureX, textureY); // Box 336
		bodyModel[321] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 337
		bodyModel[322] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 338
		bodyModel[323] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 339
		bodyModel[324] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 340
		bodyModel[325] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 341
		bodyModel[326] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 342
		bodyModel[327] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 343
		bodyModel[328] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 344
		bodyModel[329] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 345
		bodyModel[330] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 346
		bodyModel[331] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 347
		bodyModel[332] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 348
		bodyModel[333] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 349
		bodyModel[334] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 350
		bodyModel[335] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 351
		bodyModel[336] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 352
		bodyModel[337] = new ModelRendererTurbo(this, 52, 129, textureX, textureY); // Box 353
		bodyModel[338] = new ModelRendererTurbo(this, 57, 130, textureX, textureY); // Box 354
		bodyModel[339] = new ModelRendererTurbo(this, 104, 128, textureX, textureY); // Box 355

		bodyModel[0].addBox(0F, 0F, 0F, 76, 4, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-38F, -4F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-42.01F, -4F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 266
		bodyModel[2].setRotationPoint(-42F, -4F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[3].setRotationPoint(-42.01F, -12F, -8F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[4].setRotationPoint(-42.01F, -12F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[5].setRotationPoint(-42F, -6F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[6].setRotationPoint(-42F, -6F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[7].setRotationPoint(-45F, 0F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[8].setRotationPoint(-42F, -6F, 4.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[9].setRotationPoint(-42F, -6F, -6.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[10].setRotationPoint(-42.25F, -6F, 4.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[11].setRotationPoint(-42.25F, -6F, -6.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[12].setRotationPoint(-45F, 3F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[13].setRotationPoint(-45F, 2F, 2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[14].setRotationPoint(-45F, 4F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[15].setRotationPoint(-45F, 3F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-45.5F, 2F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[17].setRotationPoint(-45F, 4F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-43F, -0.5F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[19].setRotationPoint(42.01F, -4F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 266
		bodyModel[20].setRotationPoint(38F, -4F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[21].setRotationPoint(38F, -2.5F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[22].setRotationPoint(38F, 5F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[23].setRotationPoint(38F, 2.5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[24].setRotationPoint(38F, 0F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[25].setRotationPoint(38F, 4F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[26].setRotationPoint(38F, -2.5F, 7F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[27].setRotationPoint(38F, 5F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[28].setRotationPoint(38F, 2.5F, 7F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[29].setRotationPoint(38F, 0F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[30].setRotationPoint(38F, 4F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[31].setRotationPoint(38F, 1.5F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[32].setRotationPoint(41F, 0F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[33].setRotationPoint(42.01F, -12F, -8F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[34].setRotationPoint(42.02F, -6F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[35].setRotationPoint(42.01F, -12F, 8F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[36].setRotationPoint(42.02F, -6F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[37].setRotationPoint(42F, 3F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[38].setRotationPoint(42F, 2F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[39].setRotationPoint(42F, 4F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[40].setRotationPoint(42F, 3F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[41].setRotationPoint(42.5F, 2F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(42F, 4F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[43].setRotationPoint(42F, -0.5F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 214
		bodyModel[44].setRotationPoint(38F, 1.5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[45].setRotationPoint(-38.01F, -1F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[46].setRotationPoint(-38.01F, -1F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[47].setRotationPoint(-42F, -1F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[48].setRotationPoint(37F, -1F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[49].setRotationPoint(-42F, -12F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 11, 12, 14, 0F); // Box 215
		bodyModel[50].setRotationPoint(-36F, -16F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[51].setRotationPoint(-39F, -16F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[52].setRotationPoint(-39F, -16F, 1F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 218
		bodyModel[53].setRotationPoint(-39F, -16F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 14, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[54].setRotationPoint(36F, -18F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 19, 2, 0F); // Box 220
		bodyModel[55].setRotationPoint(36F, -23F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[56].setRotationPoint(36F, -18F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 49, 19, 14, 0F); // Box 223
		bodyModel[57].setRotationPoint(-13F, -23F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[58].setRotationPoint(-25F, -25F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[59].setRotationPoint(-24F, -23F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[60].setRotationPoint(-25F, -23F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 9
		bodyModel[61].setRotationPoint(-25F, -20F, 10F);

		bodyModel[62].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 10
		bodyModel[62].setRotationPoint(-24F, -20F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 15
		bodyModel[63].setRotationPoint(-25F, -20F, -7F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 12, 17, 0F); // Box 21
		bodyModel[64].setRotationPoint(-14F, -20F, -10F);

		bodyModel[65].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[65].setRotationPoint(-13.5F, -20F, 10.5F);

		bodyModel[66].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[66].setRotationPoint(-24.5F, -20F, -10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 344
		bodyModel[67].setRotationPoint(-25F, -8F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 345
		bodyModel[68].setRotationPoint(-33F, -8F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 346
		bodyModel[69].setRotationPoint(-33F, -8F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 2F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[70].setRotationPoint(-25F, -25F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[71].setRotationPoint(-25F, -25F, 0F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 349
		bodyModel[72].setRotationPoint(-25F, -23F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 11, 7, 14, 0F); // Box 350
		bodyModel[73].setRotationPoint(-36F, -23F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[74].setRotationPoint(-39F, -23F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[75].setRotationPoint(-39F, -23F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[76].setRotationPoint(-39F, -23F, 1F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[77].setRotationPoint(-39.5F, -21F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[78].setRotationPoint(-40.25F, -21F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[79].setRotationPoint(-40.25F, -19F, -1F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 358
		bodyModel[80].setRotationPoint(36.5F, -22F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 lamp
		bodyModel[81].setRotationPoint(38.75F, -21F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 360
		bodyModel[82].setRotationPoint(38.5F, -21F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 361 lamp
		bodyModel[83].setRotationPoint(38.75F, -19F, -1F);

		bodyModel[84].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 362
		bodyModel[84].setRotationPoint(-13F, -8F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 363
		bodyModel[85].setRotationPoint(-13F, -8F, 7F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[86].setRotationPoint(42F, -12F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[87].setRotationPoint(38.01F, -1F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[88].setRotationPoint(38.01F, -1F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[89].setRotationPoint(41F, -6F, -6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[90].setRotationPoint(41.25F, -6F, -6.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[91].setRotationPoint(41.25F, -6F, 4.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[92].setRotationPoint(41F, -6F, 4.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[93].setRotationPoint(-14F, -23F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[94].setRotationPoint(-25F, -23F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[95].setRotationPoint(-14F, -23F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[96].setRotationPoint(-24F, -23F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[97].setRotationPoint(1F, 3F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[98].setRotationPoint(-9F, 1F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[99].setRotationPoint(-2F, -12F, 11.01F);

		bodyModel[100].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[100].setRotationPoint(-2F, -12F, -11.01F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 243
		bodyModel[101].setRotationPoint(38F, -12F, 9F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 250
		bodyModel[102].setRotationPoint(38F, -12F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 500
		bodyModel[103].setRotationPoint(-13F, -16F, -11.01F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[104].setRotationPoint(-6F, -16F, -11.01F);

		bodyModel[105].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 503
		bodyModel[105].setRotationPoint(-13F, -16F, 11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, -1.3F, -1F, 0F, -1.3F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 131
		bodyModel[106].setRotationPoint(-33.01F, -16F, -11.01F);
		bodyModel[106].rotateAngleY = -3.14159265F;

		bodyModel[107].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 132
		bodyModel[107].setRotationPoint(-33F, -16F, -11.01F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[108].setRotationPoint(-39F, -10F, -11.01F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[109].setRotationPoint(-39F, -10F, 11.01F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0.4F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.4F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 135
		bodyModel[110].setRotationPoint(-33.01F, -16F, 11.02F);
		bodyModel[110].rotateAngleY = -3.14159265F;

		bodyModel[111].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 136
		bodyModel[111].setRotationPoint(-33F, -16F, 11.01F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[112].setRotationPoint(-35F, -6F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[113].setRotationPoint(-35F, -6F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[114].setRotationPoint(-35F, -8F, -11.01F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 140
		bodyModel[115].setRotationPoint(-34F, -8F, -11.01F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 141
		bodyModel[116].setRotationPoint(-34F, -8F, 11.01F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[117].setRotationPoint(-35F, -8F, 11.01F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 lamp
		bodyModel[118].setRotationPoint(-40.25F, -12.5F, -1F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 150
		bodyModel[119].setRotationPoint(-39.5F, -14.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 151 lamp
		bodyModel[120].setRotationPoint(-40.25F, -14.5F, -1F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 152
		bodyModel[121].setRotationPoint(-37.5F, -15F, -6F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 154
		bodyModel[122].setRotationPoint(-44F, 5F, -10F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 155
		bodyModel[123].setRotationPoint(42F, 5F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 11, 1, 7, 0F); // Box 89
		bodyModel[124].setRotationPoint(1F, -24.5F, -3.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 91
		bodyModel[125].setRotationPoint(0.5F, -24F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[126].setRotationPoint(0.5F, -22F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[127].setRotationPoint(-4.5F, -22F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[128].setRotationPoint(12.5F, -22F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[129].setRotationPoint(0.5F, -24F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[130].setRotationPoint(-4.5F, -24F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[131].setRotationPoint(12.5F, -24F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[132].setRotationPoint(0.5F, -24F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[133].setRotationPoint(12.5F, -24F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[134].setRotationPoint(12.5F, -22F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[135].setRotationPoint(0.5F, -22F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[136].setRotationPoint(-4.5F, -22F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[137].setRotationPoint(-4.5F, -24F, -9F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[138].setRotationPoint(-2F, -25F, -1.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[139].setRotationPoint(13F, -25F, -1.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[140].setRotationPoint(-37F, -23.5F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[141].setRotationPoint(35F, -23.5F, -1F);

		bodyModel[142].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 196 winterization hatch
		bodyModel[142].setRotationPoint(15F, -25F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202
		bodyModel[143].setRotationPoint(-37F, -16.5F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 lamp
		bodyModel[144].setRotationPoint(-40.25F, -18F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 216
		bodyModel[145].setRotationPoint(-39.5F, -18F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 lamp
		bodyModel[146].setRotationPoint(-40.25F, -16F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 lamp
		bodyModel[147].setRotationPoint(-41.25F, -22F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219
		bodyModel[148].setRotationPoint(-40.5F, -22F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 lamp
		bodyModel[149].setRotationPoint(-41.25F, -20F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 221 lamp
		bodyModel[150].setRotationPoint(38.75F, -15F, -1F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 222
		bodyModel[151].setRotationPoint(38.5F, -17F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 lamp
		bodyModel[152].setRotationPoint(38.75F, -17F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 lamp
		bodyModel[153].setRotationPoint(39.75F, -22F, -1F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 225
		bodyModel[154].setRotationPoint(38.5F, -22F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 lamp
		bodyModel[155].setRotationPoint(39.75F, -20F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[156].setRotationPoint(-6F, -8F, -11.01F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[157].setRotationPoint(-6F, -8F, 11.01F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[158].setRotationPoint(-2F, -27F, -1.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[159].setRotationPoint(13F, -27F, -1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[160].setRotationPoint(-6F, -16F, 11.01F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 8, 2, 0F); // Box 86
		bodyModel[161].setRotationPoint(-24F, -16F, -3F);
		bodyModel[161].rotateAngleY = -0.6981317F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[162].setRotationPoint(-9F, 0F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[163].setRotationPoint(1F, 0F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 280
		bodyModel[164].setRotationPoint(1F, 1F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[165].setRotationPoint(-9F, 3F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		bodyModel[166].setRotationPoint(1F, 3F, 9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[167].setRotationPoint(1F, 0F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 10, 1, 20, 0F); // Box 286
		bodyModel[168].setRotationPoint(1F, 0F, -10F);

		bodyModel[169].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Box 287
		bodyModel[169].setRotationPoint(1F, 3F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 3, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[170].setRotationPoint(-9F, 3F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[171].setRotationPoint(-9F, 0F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[172].setRotationPoint(-39F, -11F, -11.01F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[173].setRotationPoint(-39F, -11F, 11.01F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 292
		bodyModel[174].setRotationPoint(-14F, -23F, -7F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 293
		bodyModel[175].setRotationPoint(-11F, 0F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 294
		bodyModel[176].setRotationPoint(-11F, 3F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 295
		bodyModel[177].setRotationPoint(-12F, 0F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296
		bodyModel[178].setRotationPoint(-12F, 3F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[179].setRotationPoint(-10F, 3F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[180].setRotationPoint(-10F, 0F, -9F);

		bodyModel[181].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Box 299
		bodyModel[181].setRotationPoint(18F, -22F, -8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[182].setRotationPoint(36F, -22F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[183].setRotationPoint(36F, -22F, 1F);

		bodyModel[184].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Box 302
		bodyModel[184].setRotationPoint(18F, -22F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 303 lamp
		bodyModel[185].setRotationPoint(40.25F, -23F, -1F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 304
		bodyModel[186].setRotationPoint(39F, -23F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 305 lamp
		bodyModel[187].setRotationPoint(40.25F, -21F, -1F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 306
		bodyModel[188].setRotationPoint(39F, -25F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[189].setRotationPoint(37F, -25F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 308 lamp
		bodyModel[190].setRotationPoint(40.25F, -25F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 309 lamp
		bodyModel[191].setRotationPoint(-41.75F, -21F, -1F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 310
		bodyModel[192].setRotationPoint(-41F, -23F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 311 lamp
		bodyModel[193].setRotationPoint(-41.75F, -23F, -1F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 312
		bodyModel[194].setRotationPoint(-41F, -25F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 lamp
		bodyModel[195].setRotationPoint(-41.75F, -25F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[196].setRotationPoint(-39F, -25F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[197].setRotationPoint(-9F, 0F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[198].setRotationPoint(-9F, 3F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[199].setRotationPoint(-7F, -21.5F, -8.7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[200].setRotationPoint(-7F, -22.5F, -8.7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[201].setRotationPoint(-6.75F, -21F, -8.45F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[202].setRotationPoint(-7F, -23.5F, -8.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 323
		bodyModel[203].setRotationPoint(26.75F, -24F, -2.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 324
		bodyModel[204].setRotationPoint(17.75F, -24F, -2.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[205].setRotationPoint(-41F, -24F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[206].setRotationPoint(-41F, -25F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[207].setRotationPoint(-40.75F, -23.5F, -0.25F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[208].setRotationPoint(-40.75F, -25.5F, -1.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 332
		bodyModel[209].setRotationPoint(-40F, -25F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333
		bodyModel[210].setRotationPoint(-40F, -25F, 1F);

		bodyModel[211].addBox(0F, 0F, 0F, 18, 1, 0, 0F); // Box 334
		bodyModel[211].setRotationPoint(18F, -24F, -6F);

		bodyModel[212].addBox(0F, 0F, 0F, 18, 1, 0, 0F); // Box 335
		bodyModel[212].setRotationPoint(18F, -24F, 6F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 13, 5, 0F); // Box 336 cull
		bodyModel[213].setRotationPoint(36.5F, -17F, -6F);
		bodyModel[213].rotateAngleY = -0.4712389F;

		bodyModel[214].addBox(0F, 0F, -5F, 1, 13, 5, 0F); // Box 337 cull
		bodyModel[214].setRotationPoint(36.5F, -17F, 6F);
		bodyModel[214].rotateAngleY = 0.4712389F;

		bodyModel[215].addBox(0F, 0F, 0F, 1, 13, 5, 0F); // Box 338 cull
		bodyModel[215].setRotationPoint(-39.5F, -17F, 2F);
		bodyModel[215].rotateAngleY = -0.4712389F;

		bodyModel[216].addBox(0F, 0F, -5F, 1, 13, 5, 0F); // Box 339 cull
		bodyModel[216].setRotationPoint(-39.5F, -17F, -2F);
		bodyModel[216].rotateAngleY = 0.4712389F;

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[217].setRotationPoint(-20.5F, -26.25F, 0F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 198
		bodyModel[218].setRotationPoint(-19.5F, -26.25F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[219].setRotationPoint(-19F, -25.25F, -1.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 200
		bodyModel[220].setRotationPoint(-20F, -25.75F, -2F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 201
		bodyModel[221].setRotationPoint(-19.5F, -25.75F, 1F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 345
		bodyModel[222].setRotationPoint(-12F, 0F, -9.01F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 346
		bodyModel[223].setRotationPoint(-12F, 0F, 9.01F);

		bodyModel[224].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[224].setRotationPoint(-25F, -26.5F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 rotating lamp?
		bodyModel[225].setRotationPoint(-14.53F, -25.5F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[226].setRotationPoint(-14.37F, -25.5F, -0.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 622
		bodyModel[227].setRotationPoint(20F, 0F, -1F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 638
		bodyModel[228].setRotationPoint(28F, 0F, -1F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 639
		bodyModel[229].setRotationPoint(-30F, 0F, -1F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 640
		bodyModel[230].setRotationPoint(-22F, 0F, -1F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[231].setRotationPoint(-27F, -24.5F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[232].setRotationPoint(-27.25F, -24.5F, -1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[233].setRotationPoint(-27.25F, -22.5F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[234].setRotationPoint(-27F, -22.5F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[235].setRotationPoint(-27F, -24.5F, -7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[236].setRotationPoint(-26F, -24.5F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[237].setRotationPoint(-27F, -24.5F, 1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[238].setRotationPoint(-27F, -22.5F, 1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[239].setRotationPoint(-26F, -24.5F, 1F);

		bodyModel[240].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[240].setRotationPoint(-12F, -25F, -1F);

		bodyModel[241].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[241].setRotationPoint(-10.5F, -25F, 0F);

		bodyModel[242].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[242].setRotationPoint(-11.5F, -25F, 1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		bodyModel[243].setRotationPoint(-10F, -24F, -1F);

		bodyModel[244].addBox(0F, 0F, 2F, 3, 1, 0, 0F); // Box 262
		bodyModel[244].setRotationPoint(-23F, -25.5F, -2F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[245].setRotationPoint(-8F, -25F, 3F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 204
		bodyModel[246].setRotationPoint(-8F, -24F, 3F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 205
		bodyModel[247].setRotationPoint(-33F, -24F, 3F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 206
		bodyModel[248].setRotationPoint(-35F, -25F, 3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 267
		bodyModel[249].setRotationPoint(-26.32F, -25.5F, -0.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 268 glow
		bodyModel[250].setRotationPoint(-26.45F, -25.5F, -0.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 269
		bodyModel[251].setRotationPoint(-32F, -24F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[252].setRotationPoint(-6F, -25F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[253].setRotationPoint(-6F, -26F, -0.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 75
		bodyModel[254].setRotationPoint(-5.75F, -27F, -1.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[255].setRotationPoint(-5.75F, -27F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[256].setRotationPoint(-5.75F, -27F, 1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[257].setRotationPoint(-5.75F, -24.5F, -0.25F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[258].setRotationPoint(7.5F, -27F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[259].setRotationPoint(7.25F, -26F, -0.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		bodyModel[260].setRotationPoint(7.5F, -24.5F, -0.25F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 279
		bodyModel[261].setRotationPoint(7.25F, -25F, -0.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		bodyModel[262].setRotationPoint(7.5F, -27F, 1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 281
		bodyModel[263].setRotationPoint(7.5F, -27F, -1.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[264].setRotationPoint(-11F, -25F, 4F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 390
		bodyModel[265].setRotationPoint(-11F, -25F, 4F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 391
		bodyModel[266].setRotationPoint(-11F, -25F, 6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glow
		bodyModel[267].setRotationPoint(-10.45F, -27F, 4.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[268].setRotationPoint(-10.32F, -26F, 4.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 287
		bodyModel[269].setRotationPoint(-34.32F, -24F, -0.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 288 glow
		bodyModel[270].setRotationPoint(-34.45F, -24F, -0.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[271].setRotationPoint(-19F, -15F, -5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[272].setRotationPoint(-19.5F, -13F, -5.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[273].setRotationPoint(-22F, -14.5F, 4F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[274].setRotationPoint(-23F, -14.5F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[275].setRotationPoint(-24F, -14.5F, 4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[276].setRotationPoint(-22F, -14.5F, 3F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[277].setRotationPoint(-22F, -14.5F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[278].setRotationPoint(-24F, -14.5F, 3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[279].setRotationPoint(-24F, -14.5F, 5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[280].setRotationPoint(-23.5F, -16.5F, 3.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow
		bodyModel[281].setRotationPoint(-37.5F, -22F, -6.01F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow
		bodyModel[282].setRotationPoint(-37.5F, -22F, 6.01F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow
		bodyModel[283].setRotationPoint(36.5F, -22F, -7.01F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow
		bodyModel[284].setRotationPoint(36.5F, -22F, 7.01F);

		bodyModel[285].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 363 liveryimg 3 glow
		bodyModel[285].setRotationPoint(-36.55F, -20.5F, -6F);
		bodyModel[285].rotateAngleY = 0.4712389F;

		bodyModel[286].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 364 liveryimg 3 glow
		bodyModel[286].setRotationPoint(-36.55F, -20.5F, 6F);
		bodyModel[286].rotateAngleY = -0.4712389F;

		bodyModel[287].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[287].setRotationPoint(36.95F, -20.5F, -6F);
		bodyModel[287].rotateAngleY = -0.41887902F;

		bodyModel[288].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[288].setRotationPoint(36.95F, -20.5F, 6F);
		bodyModel[288].rotateAngleY = 0.41887902F;

		bodyModel[289].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 363 liveryimg 3 glow
		bodyModel[289].setRotationPoint(-25.35F, -22.5F, -6F);
		bodyModel[289].rotateAngleY = 0.32288591F;

		bodyModel[290].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 364 liveryimg 3 glow
		bodyModel[290].setRotationPoint(-25.4F, -22.5F, 6F);
		bodyModel[290].rotateAngleY = -0.31415927F;

		bodyModel[291].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow
		bodyModel[291].setRotationPoint(-37.5F, -15F, -6.01F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 357 glow
		bodyModel[292].setRotationPoint(-37.5F, -15F, 6.01F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[293].setRotationPoint(-10F, -25F, -4F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 204
		bodyModel[294].setRotationPoint(-8F, -24F, -4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[295].setRotationPoint(40F, -24F, -0.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[296].setRotationPoint(40F, -25F, -0.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[297].setRotationPoint(40.25F, -23.5F, -0.25F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[298].setRotationPoint(40.25F, -25.5F, -1.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 332
		bodyModel[299].setRotationPoint(38F, -25F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 333
		bodyModel[300].setRotationPoint(38F, -25F, 1F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[301].setRotationPoint(15.5F, -27F, 0.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 198
		bodyModel[302].setRotationPoint(15.5F, -27F, -1.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[303].setRotationPoint(15.5F, -26F, -1.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[304].setRotationPoint(13.5F, -27F, -0.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 0, 1, 14, 0F); // Box 226
		bodyModel[305].setRotationPoint(-42F, 5F, -7F);

		bodyModel[306].addBox(0F, 0F, 0F, 0, 1, 14, 0F); // Box 321
		bodyModel[306].setRotationPoint(42F, 5F, -7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[307].setRotationPoint(18F, -23F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[308].setRotationPoint(36F, -23F, -8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[309].setRotationPoint(18F, -23F, 7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[310].setRotationPoint(36F, -23F, 1F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 326
		bodyModel[311].setRotationPoint(-37.5F, -22F, -6F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 327
		bodyModel[312].setRotationPoint(42F, -4.01F, -2F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 328
		bodyModel[313].setRotationPoint(-44F, -4.01F, -2F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[314].setRotationPoint(42F, 5F, -9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 331
		bodyModel[315].setRotationPoint(42F, 5F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 332
		bodyModel[316].setRotationPoint(-42F, 5F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[317].setRotationPoint(-42F, 5F, -9F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 334
		bodyModel[318].setRotationPoint(-31F, -25F, 0F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 335
		bodyModel[319].setRotationPoint(-43F, -4F, -3F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 336
		bodyModel[320].setRotationPoint(42F, -4F, -3F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 337
		bodyModel[321].setRotationPoint(38F, -1F, 7F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 338
		bodyModel[322].setRotationPoint(-42F, -1F, 7F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 339
		bodyModel[323].setRotationPoint(-42F, 0F, 7F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 340
		bodyModel[324].setRotationPoint(-42F, 1.5F, 7F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 341
		bodyModel[325].setRotationPoint(-42F, 2.5F, 7F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 342
		bodyModel[326].setRotationPoint(-42F, 4F, 8F);

		bodyModel[327].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 343
		bodyModel[327].setRotationPoint(-42F, 5F, 8F);

		bodyModel[328].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 344
		bodyModel[328].setRotationPoint(-42F, -2.5F, 7F);

		bodyModel[329].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 345
		bodyModel[329].setRotationPoint(-42F, 4F, -8F);

		bodyModel[330].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 346
		bodyModel[330].setRotationPoint(-42F, 5F, -11F);

		bodyModel[331].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 347
		bodyModel[331].setRotationPoint(-42F, 2.5F, -10F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 348
		bodyModel[332].setRotationPoint(-42F, 1.5F, -7F);

		bodyModel[333].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 349
		bodyModel[333].setRotationPoint(-42F, 0F, -9F);

		bodyModel[334].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 350
		bodyModel[334].setRotationPoint(-42F, -2.5F, -8F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 351
		bodyModel[335].setRotationPoint(38F, -1F, -7F);

		bodyModel[336].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 352
		bodyModel[336].setRotationPoint(-42F, -1F, -7F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 0, 16, 0F); // Box 353
		bodyModel[337].setRotationPoint(-43F, -4.01F, -8F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 0, 16, 0F); // Box 354
		bodyModel[338].setRotationPoint(42F, -4.01F, -8F);

		bodyModel[339].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 355
		bodyModel[339].setRotationPoint(-27F, -14F, 7F);
	}
	ModelFlexicoil_C1 theTrucc = new ModelFlexicoil_C1();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 340; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 0) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c1_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.63, -0.17, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		/*} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			//we just gonna disable this bit until i need it k thx bye -bids
		 */
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c1_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.63, -0.17, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelSD9[];

}