package com.example.incrementalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    private static final String VALUE = "com.example.incrmentalcounter.VALUE";
    private static final String RUNBOOLEAN = "com.example.incrementalcounter.RUNBOOLEAN";
    public static int value = 0;
    private boolean run = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application appState = ((Application)getApplicationContext());
        Resource[] resources = appState.getGameResources();

            TextView textView = findViewById(R.id.wood);
            textView.setText(resources[0].getName());
            textView = findViewById(R.id.metal);
            textView.setText(resources[1].getName());

            ResourceView[] rv = {new ResourceView(resources[0], (TextView) findViewById(R.id.woodTotal)),
                    new ResourceView(resources[1], (TextView) findViewById(R.id.metalTotal))};

            TextViewUpdater tvu = new TextViewUpdater(rv);

            tvu.start();

    }


    public void openUpgrades(View view) {

        Intent intent = new Intent(this, Upgrades.class);
        startActivity(intent);

    }

}
