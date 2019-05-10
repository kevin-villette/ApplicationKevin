package com.example.applicationkevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void blondeMe(View view){
        Toast myToast = Toast.makeText(this, "Je suis une bonne bière!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void bruneMe(View view){
        Toast myToast = Toast.makeText(this, "Je suis une bière c'est tout!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void ipaMe(View view){
        Toast myToast = Toast.makeText(this, "Je suis spéciale moi!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe (View view) {

        // Get the text view.
        TextView showCountTextView = (TextView)
                findViewById(R.id.textView2);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it.
        Integer count = Integer.parseInt(countString);
        count++;

        // Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }
}
