package com.example.aplikasisqlite.model;

public class Data {
    private static String id;
    private static String name;
    private static String address;

    public Data(){

    }

    public Data(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public static String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.id = address;
    }
}
