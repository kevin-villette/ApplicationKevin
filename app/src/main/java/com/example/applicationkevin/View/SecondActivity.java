package com.example.applicationkevin.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import com.example.applicationkevin.R;

public class SecondActivity extends AppCompatActivity {

    private static final String SelectedBeer = "selected_Beer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showDescription();
    }

    private void showDescription() {

        TextView nameView =findViewById(R.id.name);
        TextView sizeView =findViewById(R.id.size);
        TextView taglineView = findViewById(R.id.tagline);

        ArrayList<String> beer = getIntent().getStringArrayListExtra(SelectedBeer);

        nameView.setText(beer.get(0));
        sizeView.setText(beer.get(1));
        taglineView.setText(beer.get(2));
    }
}
