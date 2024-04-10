package com.motta.Product.Controller;

import com.motta.Product.Model.Entities.Product;
import com.motta.Product.Model.Repositories.ProductRepository;
import com.motta.Product.View.ProductView;

public class ProductController {
    private ProductView productView;
    private ProductRepository productRepository;

    public ProductController(ProductView productView, ProductRepository productRepository) {
        this.productView = productView;
        this.productRepository = productRepository;
    }

    public void createProduct(){

        Product newproduct = this.productView.createProduct();
        this.productRepository.addtoProductList(newproduct);
        this.productView.viewProduct(newproduct);
    }

    public void readProduct(){
        if (!this.productRepository.isEmpty()){

            for (int i = 0; i<this.productRepository.sizeofProductList();i++){

                this.productView.viewProduct(this.productRepository.readProductList(i));
            }
        }else {
            System.out.println("There is no elements");
        }
    }

    public void updateProduct(){

        Integer ID = this.productView.enterID();
        System.out.println("Enter the updated product");
        Product product = this.productView.createProduct();

        boolean theproductischanged = this.productRepository.changeaProduct(ID,product);
        this.productView.updateProduct(theproductischanged);
    }

    public void removeProduct(){

        Product toberemoved = this.productRepository.searchbyID(this.productView.enterID());

        if (toberemoved != null){

            this.productRepository.deleteProduct(toberemoved);
        }
    }

    public ProductView getProductView() {
        return productView;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}
