package com.example.incrementalcounter;

public class Calculator extends Thread{

    private Resource[] resources;

    public Calculator(Resource[] resources) {
        this.resources = resources;
    }

    @Override
    public void run() {

        while(true) {
            for (Resource r : resources) {
                r.autoCollection();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
