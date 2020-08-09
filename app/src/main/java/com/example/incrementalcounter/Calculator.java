package com.example.incrementalcounter;

public class Calculator extends Thread{

    private ResourceView[] rv;

    public Calculator(ResourceView[] rv) {
        this.rv = rv;
    }

    @Override
    public void run() {

        while(true) {
            for (ResourceView r : rv) {
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
