package com.spartdark.favorites.dto;

import java.util.List;

/**
 * Created by spartdark on 24/07/17.
 */

public class MyResponse {

    private List<MyFavorites> fav;

    public List<MyFavorites> getFav() {
        return fav;
    }

    public void setFav(List<MyFavorites> fav) {
        this.fav = fav;
    }
}
