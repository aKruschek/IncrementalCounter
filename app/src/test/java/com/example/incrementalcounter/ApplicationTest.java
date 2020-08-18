package com.example.incrementalcounter;

//import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Test unfinished. Do not know how to mock an application instance yet and attempts so far have
//failed. Will work on later.

public class ApplicationTest {


//    @Test
//    public void testActivity() {
//        ActivityScenario.launch(MainActivity::class.java).onActivity { activity ->
//            // do something with your activity instance
//        }
//    }

    @Test
    public void manualClickingWorks()
    {

        Resource wood = new Resource("wood");

        wood.manualCollection(2);

        assertEquals(2, wood.getTotal());
    }
}
