/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.*;
import train.common.entity.rollingStock.*;
import train.common.items.ItemTCRail;

import java.util.ArrayList;

public class ItemHandler {
	
	public static boolean handleItems(Entity entity, ItemStack itemstack) {
		if (itemstack != null) {
			if (entity instanceof Freight) {
				return handleFreight(entity, itemstack);
			} else if (entity instanceof DieselTrain) {
				return false;
			} else if (entity instanceof ElectricTrain) {
				return false;
			} else if (entity instanceof SteamTrain) {
				return false;
			} else if (entity instanceof Tender) {
				return false;
			} else {
				return false;
			}
		}
		return false;
	}

	public static boolean handleFreight(Entity entity, ItemStack itemstack) {
		int logWood = OreDictionary.getOreID("logWood");
		int plankWood = OreDictionary.getOreID("plankWood");
		int slabWood =  OreDictionary.getOreID("slabWood");
		int stairWood = OreDictionary.getOreID("stairWood");
		int rubberWood = OreDictionary.getOreID("woodRubber");
		int pulpWood = OreDictionary.getOreID("pulpWood");
		int dustWood = OreDictionary.getOreID("dustWood");

		if(itemstack == null) {
			return false;
		}
		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null) {
			return false;
		}
		if (entity instanceof EntityFreightCenterbeam_Wood_1 || entity instanceof EntityFreightCenterbeam_Wood_2 || entity instanceof Freight66centerbeam || entity instanceof Freight60centerbeam ||
				entity instanceof EntityFlatCartWoodUS || entity instanceof EntityBulkheadFlatCart || entity instanceof EntityFlatCarLogs_DB ||
				entity instanceof EntityFreightWood || entity instanceof EntityFreightWood2 || entity instanceof Freight73centerbeam || entity instanceof LogcarNP) {
            int isid = OreDictionary.getOreID(itemstack);
			return isid == plankWood || isid == logWood || isid == slabWood || isid == stairWood ||
					itemstack.getItem() == Item.getItemFromBlock(Blocks.ladder) || itemstack.getItem() == Item.getItemFromBlock(Blocks.fence) || itemstack.getItem() == Item.getItemFromBlock(Blocks.fence_gate) || isid == rubberWood;
		}
		else if (entity instanceof EntityFlatCarRails_DB) {
			return block instanceof BlockRailBase || itemstack.getItem() instanceof ItemTCRail;
		}

		else if (entity instanceof EntityFreightGrain) {
			Item item = itemstack.getItem();
			if (item == Items.wheat || item == Items.wheat_seeds || item == Items.melon_seeds
					|| item == Items.pumpkin_seeds || item instanceof ItemSeeds) {
				return true;
			}
			return cropStuff(itemstack);
		}
		else if (entity instanceof EntityFreightMinetrain) {
				return block.isOpaqueCube();
		}


		else if (entity instanceof WoodchipHopper) {
			return powderWood(itemstack);
		}


		else if (entity instanceof EntityFreightSlateWagon){
			return block.getMaterial() == Material.rock;
		}
		else if (entity instanceof EntityFreightIceWagon){
			return block.getMaterial() == Material.ice || block.getMaterial() == Material.packedIce;
		}
		else {
			return true;
		}
	}

	private static boolean powderWood(ItemStack itemstack){
		String[] names = new String[] { "dustWood", "pulpWood"};
		for (String name: names){
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}


	private static boolean cropStuff(ItemStack itemstack) {
		String[] names = new String[] { "cropCorn", "cropRice", "seedRice", "seedCorn", "listAllseed" };
		for (String name: names) {
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}
}
