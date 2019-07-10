package com.dignition.bossbosses.Items;

import com.dignition.bossbosses.Main;
import com.dignition.bossbosses.init.ModItems;
import com.dignition.bossbosses.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
