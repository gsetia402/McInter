package com.example.mcinter.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {

    @SerializedName("name")
    List<String> name;

    @SerializedName("categories")
    List<Category> categories;


    List<Category> getCategories(){
        return categories;
    }


}
