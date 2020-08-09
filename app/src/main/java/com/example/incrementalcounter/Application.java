package com.example.incrementalcounter;

import android.content.res.Configuration;

public class Application extends android.app.Application {
    private Resource[] resources;
    private Item[] items;

    @Override
    public void onCreate() {
        super.onCreate();
        // Required initialization logic here!

        Resource wood = new Resource("Wood");
        Resource metal = new Resource("Metal");
        Resource[] resources= {wood, metal };
        this.resources = resources;
        Calculator calc = new Calculator(this.resources);

        calc.start();

        ItemCost[] pickaxeMaterials = {new ItemCost(wood, 20), new ItemCost(metal, 30)};
        ItemCost[] axeMaterials = {new ItemCost(wood, 30), new ItemCost(metal, 20)};

        Item pickaxe = new Item("Pickaxe", pickaxeMaterials, metal);
        Item axe = new Item("Axe", axeMaterials, wood);

        this.items = new Item[]{pickaxe, axe};

    }

    public Resource[] getGameResources()
    {
        return this.resources;
    }

    public Item[] getGameItems()
    {
        return this.items;
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}

