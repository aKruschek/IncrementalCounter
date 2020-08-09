package com.example.incrementalcounter;

import android.content.res.Configuration;

public class Application extends android.app.Application {
    private Resource[] resources;

    @Override
    public void onCreate() {
        super.onCreate();
        // Required initialization logic here!

        Resource[] resources= {new Resource("Wood"), new Resource("Metal")};
        this.resources = resources;
        Calculator calc = new Calculator(this.resources);

        calc.start();
    }

    public Resource[] getGameResources()
    {
        return this.resources;
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

