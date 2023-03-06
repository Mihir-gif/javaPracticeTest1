package com.example.demo;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("Burger",400,4.5,30);
        Food food2 = new Food("Pizza",300,5.5,40);
        System.out.println(food1);
        System.out.println(food2);
        Meal meal = new Meal();

        meal.addFood(food1);
        meal.addFood(food2);
        System.out.println(meal.getCalories());
        System.out.println(meal.getTotalPrice());
        System.out.println(meal.getProtien());
        System.out.println(meal);
    }
}
