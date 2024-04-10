package com.motta.Product.Model.Entities;

import com.motta.Categories.Controller.CategoryController;
import com.motta.Categories.Model.Entities.Category;

public class Product {
    private Integer id;
    private String nameProduct;
    private Float price;

    private Category category;

    public Product(Integer id, String nameProduct, Float price, Category category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
