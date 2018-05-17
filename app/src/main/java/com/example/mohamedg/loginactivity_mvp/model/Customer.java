package com.example.mohamedg.loginactivity_mvp.model;

public class Customer implements ICustomer {
    private String URLImage;
    private String Title;
    private String Details;

    public Customer(String URLImage, String title, String details) {
        this.URLImage = URLImage;
        Title = title;
        Details = details;
    }

    public String getURLImage() {
        return URLImage;
    }

    public String getTitle() {
        return Title;
    }

    public String getDetails() {
        return Details;
    }
}
