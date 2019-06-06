package com.example.applicationkevin.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import com.example.applicationkevin.R;

public class SecondActivity extends AppCompatActivity {

    private static final String SelectedBeer = "selected_beer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showDescription();
    }

    private void showDescription() {

        TextView descriptionView =findViewById(R.id.description);
        TextView otherView =findViewById(R.id.other);
        TextView titleView = findViewById(R.id.title);

        ArrayList<String> beer = getIntent().getStringArrayListExtra(SelectedBeer);

        titleView.setText(beer.get(0));
        descriptionView.setText(beer.get(1));
        otherView.setText(beer.get(2));
    }
}
