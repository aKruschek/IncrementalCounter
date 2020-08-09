package com.example.incrementalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;

public class Upgrades extends AppCompatActivity {

    private Item[] items;
    private Item pickaxe, axe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);

        Application appState = ((Application)getApplicationContext());
        this.items = appState.getGameItems();

        pickaxe = items[0];
        axe = items[1];

        TextView textView = findViewById(R.id.pickaxeName);
        textView.setText(items[0].getName());
        textView = findViewById(R.id.axeName);
        textView.setText(items[1].getName());

        textView = findViewById(R.id.pickaxeOwned);
        textView.setText(Integer.toString(pickaxe.getOwned()));
        textView = findViewById(R.id.axeOwned);
        textView.setText(Integer.toString(axe.getOwned()));
    }

    public void buyPickaxe(View view) throws Exception {

        pickaxe.buy();
        TextView tv = findViewById(R.id.pickaxeOwned);
        tv.setText(Integer.toString(pickaxe.getOwned()));
    }

    public void buyAxe(View view) throws Exception {

        axe.buy();
        TextView tv = findViewById(R.id.axeOwned);
        tv.setText(Integer.toString(axe.getOwned()));
    }
}
