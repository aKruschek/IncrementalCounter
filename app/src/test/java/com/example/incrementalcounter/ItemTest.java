package com.example.incrementalcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Resource wood = new Resource("wood");
    private Resource metal = new Resource("metal");

    @Test
    public void checkName()
    {
        ItemCost[] itemCosts = {new ItemCost(wood, 20), new ItemCost(metal, 30)};
        Item pickaxe = new Item("Pickaxe", itemCosts, metal);

        assertEquals("Pickaxe", pickaxe.getName());
    }

    @Test
    public void checkBuyWorks() throws Exception {
//        Item pickaxe = new Item("Pickaxe", wood, metal);

        ItemCost[] itemCosts = {new ItemCost(wood, 20), new ItemCost(metal, 30)};
        Item pickaxe = new Item("Pickaxe", itemCosts, metal);

        wood.manualCollection(20);
        metal.manualCollection(30);
        pickaxe.buy();



        assertEquals(0, wood.getTotal());
        assertEquals(0, metal.getTotal());
        assertEquals(1.1, metal.getRate(), 0.0);
        assertEquals(1.0, wood.getRate(), 0.0);
        assertEquals(1, pickaxe.getOwned());
    }
}
