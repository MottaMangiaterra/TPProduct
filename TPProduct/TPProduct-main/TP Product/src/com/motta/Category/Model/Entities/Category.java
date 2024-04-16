package com.motta.Category.Model.Entities;


public class Category {
    private Integer id;
    private String category;

    public Category(Integer id, String category) {
        this.id = id;
        this.category = category;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return STR."ID = \{id}\{'\n'}Category = \{category}\{'\n'}";
    }
}
