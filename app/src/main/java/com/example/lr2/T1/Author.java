package com.example.lr2.T1;

public class Author {
    private String name;
    private  String email;

    public Author (String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String  getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //test method

    public void setName(String name){
        this.name = name;
    }

    public  String toString(){
        return "Книга автора: " + name + ", его почта: " + email;
    }
}
