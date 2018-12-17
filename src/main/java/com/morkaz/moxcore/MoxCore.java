package com.morkaz.moxcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MoxCore extends JavaPlugin {

	public void onEnable(){
		Bukkit.getLogger().info("["+getDescription().getName()+"] Plugin enabled!");
	}

	public void onDisable(){
		Bukkit.getLogger().info("["+getDescription().getName()+"] Plugin disabled!");
	}

}
