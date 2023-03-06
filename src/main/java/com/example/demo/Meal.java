package com.example.demo;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Food> meal;

    public Meal(){
        this.meal =new ArrayList<>();
    }

    public void addFood(Food food){
        meal.add(food);
    }
    public void removeFood(Food food){
        meal.remove(food);
    }
    public int getCalories(){
        int totalCalories=0;
        for (Food meal: meal){
            totalCalories += meal.getCalories();
        }
        return totalCalories;
    }

    public double getTotalPrice(){
        double totalPrice=0;
        for (Food meal: meal){
            totalPrice += meal.getPrice();
        }
        return totalPrice;
    }
    public int getProtien(){
        int totalProtien=0;
        for (Food meal: meal){
            totalProtien += meal.getProtien();
        }
        return totalProtien;
    }

}
