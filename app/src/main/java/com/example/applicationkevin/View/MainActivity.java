package com.example.applicationkevin.View;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.applicationkevin.Controller.MainController;
import com.example.applicationkevin.Injection;
import com.example.applicationkevin.Model.Beer;
import com.example.applicationkevin.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Déclaration des variables
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instanciation de recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        controller = new MainController(this, Injection.getRestApi());
        controller.onCreate();
    }

    public void showList(List<Beer> beerList) {
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        //Instanciation de layoutManager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // define an adapter
        //Instanciation de mAdapter
        mAdapter = new MyAdapter(beerList, this);
        recyclerView.setAdapter(mAdapter);
    }


}