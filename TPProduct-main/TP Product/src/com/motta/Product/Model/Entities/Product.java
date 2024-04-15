package com.motta.Product.Model.Entities;


import com.motta.Category.Model.Entities.Category;

public class Product {
    private Integer id;
    private String nameProduct;
    private Float price;
    private Category category;

    public Product(Integer id, String nameProduct,Float price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.category = null;
    }
    public Product(Integer id, String nameProduct, Float price, Category category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.category = category;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return STR."ID = \{id}\{'\n'}Product Name = \{nameProduct}\{'\n'}Price=\{price}\{'\n'}Category = \{category}\{'\n'}";
    }


}
