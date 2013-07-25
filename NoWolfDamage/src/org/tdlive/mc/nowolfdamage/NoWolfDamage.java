package org.tdlive.mc.nowolfdamage;

/* 
 * NoWolfDamage
 * 
 * Copyright (c) 2013 tdlive aw'sum
  
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
 */

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoWolfDamage extends JavaPlugin implements Listener {

	/**
	 * @param args
	 */
	public void onEnable(){
		getLogger().info("Enabling NoWolfDamage by tdlive aw'sum");
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("Enabled.");
	}

	public void onDisable(){
		getLogger().info("Disabling NoWolfDamage by tdlive aw'sum");
		getLogger().info("Disabled.");
	}
	
	@EventHandler
	public void onEntityDamage(EntityDamageEvent e){
		if(e.getEntity().getType() == EntityType.WOLF){
			e.setCancelled(true);
		}
	}
}
