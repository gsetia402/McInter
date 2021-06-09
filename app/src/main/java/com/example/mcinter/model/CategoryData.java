package com.example.mcinter.model;

import com.google.gson.annotations.SerializedName;

public class CategoryData {

    @SerializedName("Response")
    private CategoryResponse categoryResponse;

    public CategoryResponse getCategoryResponse() {
        return categoryResponse;
    }
}
