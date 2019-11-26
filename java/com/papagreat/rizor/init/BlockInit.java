package com.papagreat.rizor.init;

import java.util.ArrayList;
import java.util.List;

import com.papagreat.rizor.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
    public static final List<Block>	BLOCKS = new ArrayList<Block>();
    
    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
    public static final Block BLOCK_OF_ELECTRINE = new BlockBase("block_of_electrine", Material.IRON);
}
