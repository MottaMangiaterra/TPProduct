package com.motta.Product.Model.Repositories;

import com.motta.Product.Model.Entities.Product;
import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> listProducts;
    public ProductRepository() {
        listProducts = new ArrayList<>();
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }
    public void addtoProductList(Product product) {
        this.listProducts.add(product);
    }
    public Product search(Integer ID){

        if (!this.listProducts.isEmpty()){

            for (Product aproduct : this.listProducts) {

                if (aproduct.getId().equals(ID)) {

                    return aproduct;
                }
            }
        }

        return null;
    }
    public boolean update(int tobechangedid, Product updatedproduct){

        Product tobechanged= search(tobechangedid);

        if (tobechanged != null){

            this.listProducts.set(this.listProducts.indexOf(tobechanged),updatedproduct);

            return true;
        }

        return false;
    }
    public boolean delete(Product toberemoved){

        if (!this.listProducts.isEmpty()){

            return this.listProducts.remove(toberemoved);
        }

        return false;
    }
}
