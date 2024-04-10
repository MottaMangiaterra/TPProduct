package com.motta.Categories.Controller;

import com.motta.Categories.Model.Entities.Category;
import com.motta.Categories.Model.Repositories.CategoryRepository;
import com.motta.Categories.View.CategoryView;

public class CategoryController {
    private CategoryView categoryView;
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryView categoryView, CategoryRepository categoryRepository) {
        this.categoryView = categoryView;
        this.categoryRepository = categoryRepository;
    }

    public void createCategory(){

        Category newcategory = this.categoryView.createCategory();

        if (categoryRepository.search(newcategory.getCategory()) == null){
            categoryNew(newcategory);
        }
        else {
            newcategory.setCategory(categoryRepository.search(newcategory.getCategory()).getCategory());
        }
    }

    private void categoryNew(Category newcategory){
        this.categoryRepository.addtoCategoryList(newcategory);
        this.categoryView.viewCategory(newcategory);
    }

    public void readCategories(){
        if (!this.categoryRepository.isEmpty()){

            for (int i = 0; i<this.categoryRepository.sizeofCategoryList(); i++){

                this.categoryView.viewCategory(this.categoryRepository.readCategoryList(i));
            }
        }else {
            System.out.println("There is no elements");
        }
    }

    public void updateCategories(){

        String acategory = this.categoryView.enterCategoryname();
        System.out.println("Enter the updated category");
        Category category = this.categoryView.createCategory();

        boolean thecategoryischanged = this.categoryRepository.changeaCategory(acategory,category);
        this.categoryView.updateCategory(thecategoryischanged);
    }

    public void removeCategories(){

        Category toberemoved = this.categoryRepository.search(this.categoryView.enterCategoryname());

        if (toberemoved != null){

            this.categoryRepository.deleteCategory(toberemoved);
        }
    }

    public CategoryView getCategoryView() {
        return categoryView;
    }

    public void setCategoryView(CategoryView categoryView) {
        this.categoryView = categoryView;
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
