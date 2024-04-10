package com.motta.Product.View;

import com.motta.Categories.Controller.CategoryController;
import com.motta.Categories.Model.Entities.Category;
import com.motta.Product.Model.Entities.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    public void viewProduct(Product product){
        if (product != null){

            System.out.println("Product Name: "+product.getNameProduct());
            System.out.println("Product ID: "+product.getId());
            System.out.println("Product Price: "+product.getPrice());
            System.out.println("Product Category: ");
            System.out.println();
        }
    }

    public Product createProduct (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the ID: ");
        Integer ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Set the product name: ");
        String nameProduct = scanner.nextLine();

        System.out.println("Set the Price: ");
        Float price = scanner.nextFloat();

        System.out.println("Set the Category: ");
        Category category = new Category(scanner.next());

        return new Product(ID,nameProduct,price,category);
    }
    public void updateProduct(boolean value){
        if (value){
            System.out.println("The change has been successful");
        }
        else {
            System.out.println("The product remains the same");
        }
    }

    public Integer enterID(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the product to be updated");
        return scanner.nextInt();
    }

    public void listProduct(ArrayList<Product> list){
        for(Product p: list){
            this.viewProduct(p);
        }
    }
}
