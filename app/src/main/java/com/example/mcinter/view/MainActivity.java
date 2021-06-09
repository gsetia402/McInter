package com.example.mcinter.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mcinter.R;
import com.example.mcinter.model.Category;
import com.example.mcinter.presenter.CategoriesPresenter;
import com.example.mcinter.view.CategoryView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements CategoryView {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CategoriesPresenter categoriesPresenter = new CategoriesPresenter(this);


        categoriesPresenter.getCategories();

    }

    @Override
    public void categoriesView(List<Category> categories) {

    }
}