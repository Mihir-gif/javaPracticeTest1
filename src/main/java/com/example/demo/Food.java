package com.example.demo;

import java.util.SplittableRandom;

public class Food {
    private String name;
    private int calories;
    private double price;
    private int protien;

    public Food(String name, int calories, double price, int protien) {
        setName(name);
        setCalories(calories);
        setPrice(price);
        setProtien(protien);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<2 || name.trim().isEmpty())
            throw new IllegalArgumentException(name + "must have 2 characters and should not be having blank spaces.");
        else
            this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if(calories<0 || calories>2000)
            throw new IllegalArgumentException(calories + "must be in range 0 and 2000");
        else
            this.calories = calories;    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0 || price>150)
            throw new IllegalArgumentException(price+"must be in range 0 to 150.");
        else
            this.price = price;    }

    public int getProtien() {
        return protien;
    }

    public void setProtien(int protien) {
        if(protien<0 || protien>100)
            throw new IllegalArgumentException(protien+"must be in range 0 to 100.");
        else
            this.protien = protien;    }

    public String toString(){
        return name + "$" + price;
    }
}