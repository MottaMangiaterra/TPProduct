package com.motta.Categories.View;

import com.motta.Categories.Model.Entities.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryView {
    public void viewCategory(Category category){
        if (category != null){

            System.out.println("Category: "+category.getCategory());
            System.out.println();
        }
    }

    public Category createCategory (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the Category type: ");
        String typeCategory = scanner.nextLine();

        return new Category(typeCategory);
    }

    public void updateCategory(boolean value){
        if (value){
            System.out.println("The change has been succesfull");
        }
        else {
            System.out.println("The product remains the same");
        }
    }

    public String enterCategoryname(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the category Name of the Category to be updated");
        return scanner.nextLine();
    }

    public void listCategory(ArrayList<Category> list){
        for(Category c: list){
            this.viewCategory(c);
        }
    }
}
