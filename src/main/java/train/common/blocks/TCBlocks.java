/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import com.jcirmodelsquad.tcjcir.blocks.BlockMILWSwitchStand;
import com.jcirmodelsquad.tcjcir.features.actualsignalblock.BlockActualSignalBlock;
import com.jcirmodelsquad.tcjcir.features.betterdetector.BlockBetterDetector;
import com.jcirmodelsquad.tcjcir.features.eti.BlockTrainMonitor;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.mtc.*;

public class TCBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		setHarvestLevels();
	}

	public static void loadBlocks() {
		BlockIDs.distilIdle.block = new BlockDistil(2, false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.distilActive.block = new BlockDistil(2, true).setHardness(3.5F).setStepSound(Block.soundTypeStone).setLightLevel(0.8F);
		//BlockIDs.signal.block = new BlockSignal(BlockIDs.signal.blockID, 16).setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		BlockIDs.assemblyTableI.block = new BlockAssemblyTableI(Material.wood).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.assemblyTableII.block = new BlockAssemblyTableII(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.assemblyTableIII.block = new BlockAssemblyTableIII(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.MILWSwitchStand.block = new BlockMILWSwitchStand().setHardness(1F).setStepSound(Block.soundTypeStone);
		BlockIDs.switchStand.block = new BlockSwitchStand().setHardness(1F).setStepSound(Block.soundTypeStone);

		BlockIDs.trainWorkbench.block = new BlockTrainWorkbench(16).setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.stopper.block = new BlockStopper().setHardness(1.7F).setStepSound(Block.soundTypeWood);

		BlockIDs.openFurnaceIdle.block = new BlockOpenHearthFurnace(false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.openFurnaceActive.block = new BlockOpenHearthFurnace(true).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.oreTC.block = new BlockOreTC().setHardness(3.0F).setResistance(5F).setStepSound(Block.soundTypeStone);

		BlockIDs.lantern.block = new BlockLantern().setHardness(1.7F).setStepSound(Block.soundTypeMetal).setLightLevel(0.98F);
		BlockIDs.waterWheel.block = new BlockWaterWheel().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.windMill.block = new BlockWindMill().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.generatorDiesel.block = new BlockGeneratorDiesel().setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		
		BlockIDs.tcRail.block = new BlockTCRail().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		BlockIDs.tcRailGag.block = new BlockTCRailGag().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		
		BlockIDs.bridgePillar.block = new BlockBridgePillar().setHardness(3.5F).setStepSound(Block.soundTypeWood);

		if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
			BlockIDs.mtcTransmitterSpeed.block = new BlockInfoTransmitterSpeed(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:speedTransmitter").setBlockName("mtcspeedtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcTransmitterMTC.block = new BlockInfoTransmitterMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtctransmitter").setBlockName("mtcstatustransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcATOStopTransmitter.block = new BlockATOTransmitterStopPoint(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:atostoptransmitter").setBlockName("mtcatostoppointtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverMTC.block = new BlockInfoGrabberMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtcreceiver").setBlockName("mtcstatusreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverDestination.block = new BlockInfoGrabberDestination(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:destinationreceiver").setBlockName("mtcdestinationreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.pdmInstructionBlock.block = new BlockPDMInstructionRadio(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:pdmradio").setBlockName("pdmradio").setCreativeTab(Traincraft.tcTab);
			//BlockIDs.betterDetector.block = new BlockBetterDetector(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:better_detector").setBlockName("betterdetector").setCreativeTab(Traincraft.tcTab);;
			//BlockIDs.mtcMultiTransmitter.block = new BlockMTCMultiTransmitter(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtc_multitransmitter").setBlockName("mutlireceiver").setCreativeTab(Traincraft.tcTab);;
			//.mtcMultiReceiver.block = new BlockMTCMultiReceiver(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:mtc_multireceiver").setBlockName("multitransmitter").setCreativeTab(Traincraft.tcTab);;
			BlockIDs.trainMonitor.block = new BlockTrainMonitor(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:better_detector").setBlockName("betterdetector").setCreativeTab(Traincraft.tcTab);
		}
		BlockIDs.actualSignalBlock.block = new BlockActualSignalBlock(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockTextureName("tc:actual_signal_block").setBlockName("actualsignalblock").setCreativeTab(Traincraft.tcTab);;
		//BlockIDs.FortyFootContainer.block = new BlockFortyFootContainer(Material.rock).setHardness(4.5F).setCreativeTab(Traincraft.tcTab).setStepSound(Block.soundTypeMetal);
		//BlockIDs.book.block = new BlockBook(BlockIDs.book.blockID);
	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(Info.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
	}

	public static void setHarvestLevels() {
		BlockIDs.trainWorkbench.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableI.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableII.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableIII.block.setHarvestLevel("axe", 0);
		BlockIDs.waterWheel.block.setHarvestLevel("axe", 0);
		BlockIDs.windMill.block.setHarvestLevel("axe", 0);
		BlockIDs.bridgePillar.block.setHarvestLevel("axe", 0);
		BlockIDs.oreTC.block.setHarvestLevel("pickaxe", 1);
		//BlockIDs.milwSwitchStand.setHarvestLevel("pickaxe",0);

		Blocks.rail.setHarvestLevel("ItemStacked", 0);
		Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}