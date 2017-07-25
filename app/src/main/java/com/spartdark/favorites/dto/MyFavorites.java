package com.spartdark.favorites.dto;

import java.util.Map;

/**
 * Created by spartdark on 24/07/17.
 */

public class MyFavorites {

    private int id;
    private String name;
    private String description;
    private Owner owner;
    private String createdAt;
    private String visibility;
    private Map<String, Products> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Map<String, Products> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Products> products) {
        this.products = products;
    }
}
