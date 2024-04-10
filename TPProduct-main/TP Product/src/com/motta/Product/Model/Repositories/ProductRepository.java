package com.motta.Product.Model.Repositories;

import com.motta.Product.Model.Entities.Product;
import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> ListProducts;

    public ProductRepository() {
        ListProducts = new ArrayList<>();
    }

    public void addtoProductList(Product product) {
        this.ListProducts.add(product);
    }

    public boolean isEmpty(){
        return this.ListProducts.isEmpty();
    }

    public Product readProductList(int index){
        return this.ListProducts.get(index);
    }

    public int sizeofProductList(){
        return this.ListProducts.size();
    }

    public Product searchbyID(Integer ID){

        if (!this.ListProducts.isEmpty()){
            for (Product aproduct : this.ListProducts) {

                if (aproduct.getId().equals(ID)) {
                    return aproduct;
                }
            }
        }

        return null;
    }

    public boolean changeaProduct(int ID, Product updatedproduct){

        Product tobechanged=searchbyID(ID);

        if (tobechanged != null){

            this.ListProducts.set(this.ListProducts.indexOf(tobechanged),updatedproduct);

            return true;
        }

        return false;
    }

    public void deleteProduct(Product toberemoved){

        if (!this.ListProducts.isEmpty()){
            this.ListProducts.remove(toberemoved);
        }
    }

    public ArrayList<Product> getListProducts() {
        return ListProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        ListProducts = listProducts;
    }
}
