package com.example.applicationkevin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Injection {
    private static RestApiBeer restApiBeer;

    //Singleton
    public static RestApiBeer getRestApi(){
        if(restApiBeer == null){
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://ontariobeerapi.ca/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            restApiBeer = retrofit.create(RestApiBeer.class);
        }
        return restApiBeer;
    }
}
