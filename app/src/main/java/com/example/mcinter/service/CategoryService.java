package com.example.mcinter.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CategoryService {

    private Retrofit retrofit = null;

    public CategoryApi getApi() {
        String URL = "https://enigmatic-coast-6264.herokuapp.com/";

        if (retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit.create(CategoryApi.class);
    }



}
