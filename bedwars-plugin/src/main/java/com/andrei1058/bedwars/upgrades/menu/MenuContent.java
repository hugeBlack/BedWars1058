package com.andrei1058.bedwars.upgrades.menu;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public interface MenuContent {

    /**
     * Item that represent the item in the GUI.
     *
     * @return item.
     */
    ItemStack getDisplayItem();

    /**
     * Manage what to do on click.
     */
    void onClick(ClickType clickType);
}