package com.example.incrementalcounter;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ResourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void resourceSubtractTotalTest() throws Exception {
        Resource wood = new Resource("wood");
        wood.manualCollection(15);

        wood.spend(10);
        assertEquals(5, wood.getTotal());
    }

    @Test
    public void cannotSpendMoreThanOwned() throws Exception {
        Resource wood = new Resource("wood");

        thrown.expect(Exception.class);
        thrown.expectMessage("Insufficient resources");
        wood.spend(10);
    }
}
