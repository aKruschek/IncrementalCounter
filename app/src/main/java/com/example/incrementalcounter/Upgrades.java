package com.example.incrementalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Upgrades extends AppCompatActivity {

    private Item[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);

        Application appState = ((Application)getApplicationContext());
        this.items = appState.getGameItems();

        TextView textView = findViewById(R.id.pickaxeName);
        textView.setText(items[0].getName());
        textView = findViewById(R.id.axeName);
        textView.setText(items[1].getName());

        textView = findViewById(R.id.pickaxeOwned);
        textView.setText(Integer.toString(items[0].getOwned()));
        textView = findViewById(R.id.axeOwned);
        textView.setText(Integer.toString(items[1].getOwned()));
    }
}
