package com.example.incrementalcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Resource wood = new Resource("wood");
    private Resource metal = new Resource("metal");

    @Test
    public void checkName()
    {
        Item pickaxe = new Item("Pickaxe", wood, metal);

        assertEquals("Pickaxe", pickaxe.getName());
    }

    @Test
    public void checkBuyWorks() throws Exception {
        Item pickaxe = new Item("Pickaxe", wood, metal);

        wood.manualCollection(20);
        metal.manualCollection(30);
        pickaxe.buy();

        assertEquals(0, wood.getTotal());
        assertEquals(1, pickaxe.getOwned());
    }
}
