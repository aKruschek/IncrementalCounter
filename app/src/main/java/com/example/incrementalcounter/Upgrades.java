package com.example.incrementalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Upgrades extends AppCompatActivity {

    private Item[] items;
    private Item pickaxe, axe;
    private ItemCost[] itemCostsPickaxe, itemCostsAxe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);

        Application appState = ((Application)getApplicationContext());
        this.items = appState.getGameItems();

        pickaxe = items[0];
        axe = items[1];

        itemCostsPickaxe = pickaxe.getItemCosts();
        itemCostsAxe = axe.getItemCosts();

//        TextView textView = findViewById(R.id.pickaxeName);
//        textView.setText(items[0].getName());
//        textView = findViewById(R.id.axeName);
//        textView.setText(items[1].getName());

        findAndSetText(R.id.pickaxeName, pickaxe.getName());
        findAndSetText(R.id.axeName, axe.getName());

//        textView = findViewById(R.id.pickaxeOwned);
//        textView.setText(Integer.toString(pickaxe.getOwned()));
//        textView = findViewById(R.id.axeOwned);
//        textView.setText(Integer.toString(axe.getOwned()));

        findAndSetText(R.id.pickaxeOwned, Integer.toString(pickaxe.getOwned()));
        findAndSetText(R.id.axeOwned, Integer.toString(axe.getOwned()));

        findAndSetText(R.id.pickaxeWoodCostName, itemCostsPickaxe[0].getResource().getName());
        findAndSetText(R.id.pickaxeWoodCostNum, Integer.toString(itemCostsPickaxe[0].getCost()));
        findAndSetText(R.id.pickaxeMetalCostName, itemCostsPickaxe[1].getResource().getName());
        findAndSetText(R.id.pickaxeMetalCostNum, Integer.toString(itemCostsPickaxe[1].getCost()));

        findAndSetText(R.id.axeWoodCostName, itemCostsAxe[0].getResource().getName());
        findAndSetText(R.id.axeWoodCostNum, Integer.toString(itemCostsAxe[0].getCost()));
        findAndSetText(R.id.axeMetalCostName, itemCostsAxe[1].getResource().getName());
        findAndSetText(R.id.axeMetalCostNum, Integer.toString(itemCostsAxe[1].getCost()));

    }

    public void findAndSetText(int boxName, String string)
    {
        TextView textView = findViewById(boxName);
        textView.setText(string);
    }

    public void buyPickaxe(View view) throws Exception {

        pickaxe.buy();
        TextView tv = findViewById(R.id.pickaxeOwned);
        tv.setText(Integer.toString(pickaxe.getOwned()));

        findAndSetText(R.id.pickaxeWoodCostName, itemCostsPickaxe[0].getResource().getName());
        findAndSetText(R.id.pickaxeWoodCostNum, Integer.toString(itemCostsPickaxe[0].getCost()));
        findAndSetText(R.id.pickaxeMetalCostName, itemCostsPickaxe[1].getResource().getName());
        findAndSetText(R.id.pickaxeMetalCostNum, Integer.toString(itemCostsPickaxe[1].getCost()));
    }

    public void buyAxe(View view) throws Exception {

        axe.buy();
        TextView tv = findViewById(R.id.axeOwned);
        tv.setText(Integer.toString(axe.getOwned()));

        findAndSetText(R.id.axeWoodCostName, itemCostsAxe[0].getResource().getName());
        findAndSetText(R.id.axeWoodCostNum, Integer.toString(itemCostsAxe[0].getCost()));
        findAndSetText(R.id.axeMetalCostName, itemCostsAxe[1].getResource().getName());
        findAndSetText(R.id.axeMetalCostNum, Integer.toString(itemCostsAxe[1].getCost()));
    }
}
