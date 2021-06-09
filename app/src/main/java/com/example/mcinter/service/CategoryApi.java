package com.example.mcinter.service;

import com.example.mcinter.model.CategoryData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CategoryApi {

    @GET("categories")
    Call<CategoryData> getCategories();



}
