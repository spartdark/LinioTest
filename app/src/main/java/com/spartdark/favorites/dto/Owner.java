package com.spartdark.favorites.dto;

/**
 * Created by spartdark on 24/07/17.
 */

public class Owner {
    private String name;
    private String email;
    private String linioId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinioId() {
        return linioId;
    }

    public void setLinioId(String linioId) {
        this.linioId = linioId;
    }
}
