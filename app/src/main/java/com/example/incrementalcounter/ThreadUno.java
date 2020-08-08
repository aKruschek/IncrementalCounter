package com.example.incrementalcounter;

import android.content.Intent;
import android.widget.TextView;

public class ThreadUno extends Thread {

    private int value;
    private int timer;
    private int start = 0;
    private TextView textView;

    public ThreadUno(TextView textView, int value, int timer) {
        this.textView = textView;
        this.timer = timer;
        this.value = value;
    }


    public void run()
    {

        while(start < timer)
        {
            value += 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            textView.setText(Integer.toString(value));
            start++;
        }
    }

    public int getValue()
    {
        return value;
    }
}
