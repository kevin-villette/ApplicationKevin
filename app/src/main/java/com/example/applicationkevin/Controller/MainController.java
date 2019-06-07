package com.example.applicationkevin.Controller;

import com.example.applicationkevin.Model.Beer;
import com.example.applicationkevin.RestApiBeer;
import com.example.applicationkevin.View.MainActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainController {

    public MainActivity view;
    private RestApiBeer restApiBeer;

    public MainController(MainActivity view, RestApiBeer restApiBeer) {
        this.view = view;
        this.restApiBeer = restApiBeer;
    }

    public void onCreate() {
        Call<List<Beer>> call = restApiBeer.getBeerData();
        call.enqueue(new Callback<List<Beer>>() {
            @Override
            public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
                List<Beer> restBeerResponse = response.body();
                List<Beer> beerList = restBeerResponse;
                view.showList(beerList);
            }

            @Override
            public void onFailure(Call<List<Beer>> call, Throwable t) {

            }
        });
    }
}
