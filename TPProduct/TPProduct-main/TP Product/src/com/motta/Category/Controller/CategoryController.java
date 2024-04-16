package com.motta.Category.Controller;


import com.motta.Category.Model.Entities.Category;
import com.motta.Category.Model.Repositories.CategoryRepository;
import com.motta.Category.View.CategoryView;

public class CategoryController {
    private CategoryView categoryView;
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryView categoryView, CategoryRepository categoryRepository) {
        this.categoryView = categoryView;
        this.categoryRepository = categoryRepository;
    }

    public void createCategory(){

        Category category = this.categoryView.createCategory();
        this.categoryRepository.addtoListCategories(category);
        this.categoryView.viewCategory(category);
    }
}
