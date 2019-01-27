package com.morkaz.moxcore;

import com.morkaz.moxcore.misc.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MoxCore extends JavaPlugin {

	private Metrics metrics;

	@Override
	public void onEnable(){
		//Add Metrics
		metrics = new Metrics(this);

		//Ending
		Bukkit.getLogger().info("["+getDescription().getName()+"] Plugin enabled!");
	}

	@Override
	public void onDisable(){
		//Ending
		Bukkit.getLogger().info("["+getDescription().getName()+"] Plugin disabled!");
	}

}
