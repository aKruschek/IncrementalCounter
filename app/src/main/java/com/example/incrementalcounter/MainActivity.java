package com.example.incrementalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    private static final String VALUE = "com.example.incrmentalcounter.VALUE";
    private static final String RUNBOOLEAN = "com.example.incrementalcounter.RUNBOOLEAN";
    public static int value = 0;
    public  boolean run = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resource[] resources = {new Resource("Wood"), new Resource ("Metal")};

        TextView textView = findViewById(R.id.wood);
        textView.setText(resources[0].getName());
        textView = findViewById(R.id.metal);
        textView.setText(resources[1].getName());

        textView = findViewById(R.id.woodTotal);
        textView.setText(Integer.toString(resources[0].getTotal()));
        textView = findViewById(R.id.metalTotal);
        textView.setText(Integer.toString(resources[1].getTotal()));

    }

//    public void addOne(View view)
//    {
//
//        //Get value from number box and add 1.
//        TextView textView = findViewById(R.id.numberBox);
//        int value = parseInt(textView.getText().toString());
//
//       ThreadUno threadUno = new ThreadUno(textView, value, 30);
//
//       threadUno.start();
//
//    }

}
