package com.example.abhirawat.mvp_app.model;

/**
 * Created by Abhi Rawat on 27-09-2017.
 */

public class Message {
    private String name;
    private String password;

    public Message() {
    }
    public void setNameAndPassword(String name,String password)
    {
        this.name = name;
        this.password = password;
    }
}
