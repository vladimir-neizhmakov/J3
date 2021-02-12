package com.geekbrains.app;


import java.util.Random;

public class Product {
    public static int id;
    public static String title;
    public static double cost;
    public static final String[] productType = {"Apple","Juce", "Milk"};

    public Product () {
        Random random = new Random();
        id++;
        this.id = id;
        this.title = productType[new Random().nextInt(productType.length)];
        this.cost = new Random().nextInt(100);
    }

    public String getProduct(){
        return String.valueOf(id) +". "+title+" Cost:"+ String.valueOf(cost);
    }

}