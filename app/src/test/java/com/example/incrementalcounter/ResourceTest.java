package com.example.incrementalcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResourceTest {
    @Test
    public void addition_isCorrect() {
        Resource wood = new Resource("Wood");
        assertEquals("Wood", wood.getName());
    }
}
