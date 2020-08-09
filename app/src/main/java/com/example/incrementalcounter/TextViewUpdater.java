package com.example.incrementalcounter;

import android.widget.TextView;

public class TextViewUpdater extends Thread {

    private ResourceView[] rv;

    public TextViewUpdater(ResourceView[] rv)
    {
        this.rv = rv;
    }

    @Override
    public void run() {
        while(true)
        {
            for(ResourceView r : rv)
            {
                r.setText();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
