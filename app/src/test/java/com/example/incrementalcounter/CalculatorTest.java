package com.example.incrementalcounter;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void canIncrementResourcesWithCalc() throws InterruptedException {
        Resource[] resources= {new Resource("Wood"), new Resource("Metal")};
        Calculator calc = new Calculator(resources);

       calc.start();

        Thread.sleep(1000);

        assertTrue(resources[0].getTotal() > 0);
        assertTrue(resources[1].getTotal() > 0);
    }


}
