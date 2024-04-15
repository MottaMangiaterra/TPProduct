package com.motta.Category.View;

import com.motta.Category.Model.Entities.Category;
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

    public Category createCategory(Integer id){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the category name: ");
        String category = scanner.nextLine();

        return new Category(id,category);
    }

    public void viewCategory (Category category){

            System.out.println(category.toString());
    }
    public Integer enterID(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the category to be updated");
        return scanner.nextInt();
    }
}
