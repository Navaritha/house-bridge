// Home.java
package com.example.homebuyapp;

public class Home {
    private int imageResId;
    private String details;
    private int numPeople;
    private String rent;

    public Home(int imageResId, String details, int numPeople, String rent) {
        this.imageResId = imageResId;
        this.details = details;
        this.numPeople = numPeople;
        this.rent = rent;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDetails() {
        return details;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public String getRent() {
        return rent;
    }
}
