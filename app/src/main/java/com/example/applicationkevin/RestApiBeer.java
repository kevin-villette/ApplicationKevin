package com.example.applicationkevin;

import com.example.applicationkevin.Model.RestBeerResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiBeer {
    @GET("beers")
    Call<RestBeerResponse> getBeerData();
}
