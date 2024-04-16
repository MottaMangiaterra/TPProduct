package com.motta.Category.View;

import com.motta.Category.Model.Entities.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryView {

    public Category createCategory(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the ID: ");
        Integer ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Set the category name: ");
        String category = scanner.nextLine();

        return new Category(ID,category);
    }

    public void viewCategory (Category category){

            System.out.println(category.toString());
    }

    public Integer enterID(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the category to be updated");
        return scanner.nextInt();
    }

    public Category chooseCategory(ArrayList<Category>categories){

        Category retorno = null;

        if (categories != null){

            Scanner scanner = new Scanner(System.in);
            int op = -1;
            int counter = 0;

            for (Category acategory : categories){
                System.out.printf(counter+". "+acategory.getCategory());
                counter++;
            }
            System.out.println(counter+". Make a New Category");

            do {
                System.out.println("Choose a Category for your product");
                op = scanner.nextInt();

            }while (op >= 0 && op<=categories.size());

            if (op < categories.size()) {
                retorno = categories.get(op);
            }
        }

        return retorno;
    }
}
