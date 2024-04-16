package com.motta.Product.Controller;

import com.motta.Category.Model.Entities.Category;
import com.motta.Category.Model.Repositories.CategoryRepository;
import com.motta.Category.View.CategoryView;
import com.motta.Product.Model.Entities.Product;
import com.motta.Product.Model.Repositories.ProductRepository;
import com.motta.Product.View.ProductView;

import java.util.ArrayList;

public class ProductController {
    private ProductView productView;
    private ProductRepository productRepository;
    private CategoryView categoryView;
    private CategoryRepository categoryRepository;

    public ProductController(ProductView productView, ProductRepository productRepository, CategoryView categoryView, CategoryRepository categoryRepository) {
        this.productView = productView;
        this.productRepository = productRepository;
        this.categoryView = categoryView;
        this.categoryRepository = categoryRepository;
    }


    public void createProduct(){

        Product newproduct = this.productView.createProduct();
        Category category = this.categoryView.chooseCategory(this.categoryRepository.getListCategories());

        if (category==null) {

            category = this.categoryView.createCategory();

            if (this.categoryRepository.search(category.getId()) == null){
                this.categoryRepository.addtoListCategories(category);
            }

            newproduct.setCategory(category);
        }
        this.productRepository.addtoProductList(newproduct);
        this.productView.viewProduct(newproduct);

    }
    public void readProduct(){
        if (!this.productRepository.getListProducts().isEmpty()){

            for (Product aproduct : this.productRepository.getListProducts()){

                this.productView.viewProduct(aproduct);
            }
        }else {
            System.out.println("There is no elements");
        }
    }

    public void updateProduct(){

        Integer ID = this.productView.enterID();
        Product product = null;
        product = this.productView.updateaProduct(product);

        boolean change = this.productRepository.update(ID,product);
        this.productView.change(change);
    }

    public void deleteProduct(){

        Product toberemoved = this.productRepository.search(this.productView.enterID());

        if (toberemoved != null){

            boolean change = this.productRepository.delete(toberemoved);
            this.productView.change(change);
        }else {

            this.productView.change(false);
        }
    }

}
