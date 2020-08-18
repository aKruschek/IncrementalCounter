package com.example.incrementalcounter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends Activity {

    protected Application application;
    private TextView woodViewName, metalViewName, woodViewTotal, metalViewTotal;
    private Resource wood, metal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        application = ((Application)this.getApplicationContext());
        Resource[] resources = application.getGameResources();

            wood = resources[0];
            metal = resources[1];

            TextView textView = findViewById(R.id.wood);
            woodViewName = textView;
            textView.setText(wood.getName());

            textView = findViewById(R.id.metal);
            metalViewName = textView;
            textView.setText(metal.getName());

            textView = findViewById(R.id.woodTotal);
            woodViewTotal = textView;

            textView = findViewById(R.id.metalTotal);
            metalViewTotal = textView;

            ResourceView[] rv = {new ResourceView(wood, woodViewTotal),
                    new ResourceView(metal, metalViewTotal)};

            TextViewUpdater tvu = new TextViewUpdater(rv);

            tvu.start();

    }


    public void openUpgrades(View view) {

        Intent intent = new Intent(this, Upgrades.class);
        startActivity(intent);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonWood:
                if (checked)
                    StaticUtility.setRadioValue(1);
                    break;
            case R.id.radioButtonMetal:
                if (checked)
                    StaticUtility.setRadioValue(2);
                    break;
        }


    }

    public void onManualCollectionClicked(View view)
    {
        application = ((Application)getApplicationContext());
        application.manualCollection();

        switch(StaticUtility.getRadioValue()) {
            case 0:
                break;
            case 1:
                woodViewTotal.setText(Integer.toString(wood.getTotal()));
                break;
            case 2:
                metalViewTotal.setText(Integer.toString(metal.getTotal()));
                break;
        }
    }


}
