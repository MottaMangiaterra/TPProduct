package com.motta.Categories.Model.Repositories;

import com.motta.Categories.Model.Entities.Category;

import java.util.ArrayList;

public class CategoryRepository {
    private ArrayList<Category> ListCategories;

    public CategoryRepository() {
        ListCategories = new ArrayList<>();
    }

    public void addtoCategoryList(Category category) {

        if (!this.ListCategories.contains(category)){

            this.ListCategories.add(category);
        }
    }

    public boolean isEmpty(){
        return this.ListCategories.isEmpty();
    }

    public Category readCategoryList(int index){
        return this.ListCategories.get(index);
    }

    public int sizeofCategoryList(){
        return this.ListCategories.size();
    }

    public Category search(String category){

        if (!this.ListCategories.isEmpty()){
            for (Category acategory : this.ListCategories) {

                if (acategory.getCategory().compareTo(category) == 0) {
                    return acategory;
                }
            }
        }

        return null;
    }

    public boolean changeaCategory(String category,Category updatedcategory){

        Category tobechanged = search(category);

        if (tobechanged != null){

            this.ListCategories.set(this.ListCategories.indexOf(tobechanged),updatedcategory);

            return true;
        }

        return false;
    }

    public void deleteCategory(Category toberemoved){

        if (!this.ListCategories.isEmpty()){
            this.ListCategories.remove(toberemoved);
        }
    }

    public ArrayList<Category> getListCategories() {
        return ListCategories;
    }

    public void setListCategories(ArrayList<Category> listCategories) {
        ListCategories = listCategories;
    }
}
