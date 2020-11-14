package train.client.core.handlers;

import jdk.nashorn.internal.ir.Block;
import net.minecraft.item.Item;
import train.common.core.interfaces.ITCRecipe;
import train.common.core.managers.TierRecipe;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.recipes.ShapedTrainRecipes;
import train.common.recipes.ShapelessTrainRecipe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecipeBookHandler {
	/**
	 * This is used to show if the recipe can also be crafted in vanilla workbench
	 */
	public static String[] vanillaWorkTableRecipes = new String[17];

	public RecipeBookHandler() {
		vanillaWorkTableRecipes[0] = BlockIDs.assemblyTableI.block.getUnlocalizedName();
		vanillaWorkTableRecipes[1] = BlockIDs.assemblyTableII.block.getUnlocalizedName();
		vanillaWorkTableRecipes[2] = BlockIDs.assemblyTableIII.block.getUnlocalizedName();
		vanillaWorkTableRecipes[3] = BlockIDs.distilIdle.block.getUnlocalizedName();
		vanillaWorkTableRecipes[4] = BlockIDs.openFurnaceIdle.block.getUnlocalizedName();
		vanillaWorkTableRecipes[5] = BlockIDs.trainWorkbench.block.getUnlocalizedName();
		vanillaWorkTableRecipes[6] = ItemIDs.overalls.item.getUnlocalizedName();
		vanillaWorkTableRecipes[7] = ItemIDs.jacket.item.getUnlocalizedName();
		vanillaWorkTableRecipes[8] = ItemIDs.hat.item.getUnlocalizedName();
		vanillaWorkTableRecipes[9] = ItemIDs.recipeBook.item.getUnlocalizedName();
		vanillaWorkTableRecipes[10] = BlockIDs.lantern.block.getUnlocalizedName();
		vanillaWorkTableRecipes[11] = ItemIDs.pants_driver_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[12] = ItemIDs.pants_ticketMan_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[13] = ItemIDs.hat_driver_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[14] = ItemIDs.hat_ticketMan_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[15] = ItemIDs.jacket_driver_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[16] = ItemIDs.jacket_ticketMan_paintable.item.getUnlocalizedName();
		//vanillaWorkTableRecipes[17] = BlockIDs.switchStand.block.getUnlocalizedName();
	}

	// TODO: Make parameters more specific than List
	public static List<ITCRecipe> workbenchListCleaner(List recipeList) {
		Set<String> outputs = new HashSet<String>();
		ArrayList<ITCRecipe> cleaned = new ArrayList<ITCRecipe>();
		for(Object r: recipeList) {
			if (r instanceof ShapedTrainRecipes || r instanceof ShapelessTrainRecipe) {
				ITCRecipe recipe = (ITCRecipe) r;
				String output = Item.itemRegistry.getNameForObject(recipe.getRecipeOutput().getItem());
				if (!outputs.contains(output)) {
					cleaned.add(recipe);
					outputs.add(output);
				}
			}
		}
		return cleaned;
	}

	// TODO: Make it more generic: TierRecipe -> ITierRecipe
	public static List<TierRecipe> assemblyListCleaner(List recipeList) {
		Set<String> outputs = new HashSet<String>();
		ArrayList<TierRecipe> cleanedList = new ArrayList<TierRecipe>();
		for(Object r: recipeList) {
			if(r instanceof TierRecipe) {
				TierRecipe recipe = (TierRecipe) r;
				String output = Item.itemRegistry.getNameForObject(recipe.getOutput().getItem());
				if (!outputs.contains(output)) {
					cleanedList.add(recipe);
					outputs.add(output);
				}
			}
		}
		return cleanedList;
	}
}