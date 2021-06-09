package com.example.mcinter.presenter;

import com.example.mcinter.model.Category;
import com.example.mcinter.model.CategoryData;
import com.example.mcinter.service.CategoryService;
import com.example.mcinter.view.CategoryView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriesPresenter {

    CategoryView categoryView;
    CategoryService categoryService;


    public CategoriesPresenter(CategoryView view){
        this.categoryView = view;

        this.categoryService = new CategoryService();

    }

    public void getCategories(){

        categoryService.getApi().getCategories().enqueue(new Callback<CategoryData>() {
            @Override
            public void onResponse(Call<CategoryData> call, Response<CategoryData> response) {

                CategoryData categoryData = response.body();

                if (categoryData != null){
                    List<Category> categories = categoryData.getCategoryResponse().
                }

            }

            @Override
            public void onFailure(Call<CategoryData> call, Throwable t) {

            }
        });

    }

}
