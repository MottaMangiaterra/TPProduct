package com.motta.Product.View;

import com.motta.Category.Model.Entities.Category;
import com.motta.Product.Model.Entities.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {

    public Product createProduct (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the ID: ");
        Integer ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Set the product name: ");
        String nameProduct = scanner.nextLine();

        System.out.println("Set the Price: ");
        Float price = scanner.nextFloat();

        return new Product(ID,nameProduct,price);
    }
    public Product createProduct (Category category){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the ID: ");
        Integer ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Set the product name: ");
        String nameProduct = scanner.nextLine();

        System.out.println("Set the Price: ");
        Float price = scanner.nextFloat();

        return new Product(ID,nameProduct,price,category);
    }
    public void viewProduct(Product product){

            System.out.println(product.toString());
    }
    public Integer enterID(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the product to be updated");
        return scanner.nextInt();
    }
    public void change(boolean value){

        if (value){
            System.out.println("The change has been successful");
        }
        else {
            System.out.println("Something happen");
        }
    }
    public Product updateaProduct(Product product){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the updated product\n");

        System.out.println("Set the ID: ");
        product.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Set the product name: ");
        product.setNameProduct(scanner.nextLine());

        System.out.println("Set the Price: ");
        product.setPrice(scanner.nextFloat());

        return product;
    }
}
