package com.spartdark.favorites.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by spartdark on 24/07/17.
 */

public class Products {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("namename")
    @Expose
    private String namename;
    @SerializedName("wishListPrice")
    @Expose
    private int wishListPrice;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("linioPlusLevel")
    @Expose
    private int linioPlusLevel;
    @SerializedName("conditionType")
    @Expose
    private String conditionType;
    @SerializedName("freeShipping")
    @Expose
    private boolean freeShipping;
    @SerializedName("imported")
    @Expose
    private boolean imported;
    @SerializedName("active")
    @Expose
    private boolean active;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamename() {
        return namename;
    }

    public void setNamename(String namename) {
        this.namename = namename;
    }

    public int getWishListPrice() {
        return wishListPrice;
    }

    public void setWishListPrice(int wishListPrice) {
        this.wishListPrice = wishListPrice;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLinioPlusLevel() {
        return linioPlusLevel;
    }

    public void setLinioPlusLevel(int linioPlusLevel) {
        this.linioPlusLevel = linioPlusLevel;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
