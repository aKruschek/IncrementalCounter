package com.example.incrementalcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResourceTest {
    @Test
    public void resourceNameIsCorrect()
    {
        Resource wood = new Resource("Wood");
        assertEquals("Wood", wood.getName());
    }

    @Test
    public void resourceRateAddsCorrectly()
    {
        Resource wood = new Resource("wood");
        wood.autoCollection();

        assertEquals(1, wood.getTotal());
    }

    @Test public void resourceManualCollectionWorks()
    {
        Resource wood = new Resource("wood");

        wood.manualCollection(1);
        assertEquals(1, wood.getTotal());

        wood.manualCollection(7);
        assertEquals(8, wood.getTotal());
    }
}
