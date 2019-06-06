package com.example.applicationkevin.Controller;

import com.example.applicationkevin.Model.Beer;
import com.example.applicationkevin.Model.RestBeerResponse;
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
        Call<RestBeerResponse> call = restApiBeer.getBeerData();
        call.enqueue(new Callback<RestBeerResponse>() {
            @Override
            public void onResponse(Call<RestBeerResponse> call, Response<RestBeerResponse> response) {
                RestBeerResponse RestBeerResponse = response.body();
                List<Beer> beerList = RestBeerResponse.getResults();
                view.showList(beerList);
            }

            @Override
            public void onFailure(Call<RestBeerResponse> call, Throwable t) {

            }
        });
    }
}
