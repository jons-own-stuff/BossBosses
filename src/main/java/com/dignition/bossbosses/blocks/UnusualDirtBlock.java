package com.dignition.bossbosses.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraft.creativetab.CreativeTabs;

public class UnusualDirtBlock extends BlockBase {

	public UnusualDirtBlock(String name, Material material) {
		super(name, material);

		setSoundType(SoundType.GROUND);
		setHardness(0.4F);
		setResistance(1.0F);
		setHarvestLevel("spade", 1);
		setLightLevel(1.0F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
