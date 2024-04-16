package com.motta.Category.Model.Repositories;

import com.motta.Category.Model.Entities.Category;

import java.util.ArrayList;

public class CategoryRepository {
    private ArrayList<Category> listCategories;

    public CategoryRepository() {
        listCategories = new ArrayList<>();
    }


    public ArrayList<Category> getListCategories() {
        return listCategories;
    }

    public void addtoListCategories(Category category) {
        this.listCategories.add(category);
    }

    public Category search(Integer ID){

        if (!this.listCategories.isEmpty()){

            for (Category acategory : this.listCategories) {

                if (acategory.getId().equals(ID)) {

                    return acategory;
                }
            }
        }

        return null;
    }

    public Category search(String categoryName){

        if (!this.listCategories.isEmpty()){

            for (Category acategory : this.listCategories) {

                if (acategory.getCategory().equals(categoryName)) {

                    return acategory;
                }
            }
        }

        return null;
    }

    public boolean update(int tobechangedid, Category updatedcategory){

        Category tobechanged= search(tobechangedid);

        if (tobechanged != null){

            this.listCategories.set(this.listCategories.indexOf(tobechanged),updatedcategory);

            return true;
        }

        return false;
    }

    public boolean delete(Category toberemoved){

        if (!this.listCategories.isEmpty()){

            return this.listCategories.remove(toberemoved);
        }

        return false;
    }
}
