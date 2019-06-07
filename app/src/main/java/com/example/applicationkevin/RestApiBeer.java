package com.example.applicationkevin;

import com.example.applicationkevin.Model.Beer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiBeer {
    @GET("beers")
    Call<List<Beer>> getBeerData();
}
