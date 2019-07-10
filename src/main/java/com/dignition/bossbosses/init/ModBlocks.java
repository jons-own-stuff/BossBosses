package com.dignition.bossbosses.init;

import java.util.ArrayList;
import java.util.List;

import com.dignition.bossbosses.blocks.BlockBase;
import com.dignition.bossbosses.blocks.UnusualDirtBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block UNUSUAL_DIRT_BLOCK = new UnusualDirtBlock("unusual_dirt_block", Material.GRASS);
}
