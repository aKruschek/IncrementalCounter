package com.example.incrementalcounter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ItemCostTest {

    @Test
    public void doesCostSetCorrectly()
    {
        Resource wood = new Resource("wood");
        Resource metal = new Resource("metal");
        ItemCost metalCost = new ItemCost(metal, 30);
        ItemCost woodCost = new ItemCost(wood, 20);

        woodCost.changeCost(2);
        metalCost.changeCost(2);

        assertEquals(40, woodCost.getCost());
        assertEquals(60, metalCost.getCost());
    }
}
