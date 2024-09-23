package com.northcoders.api_new_project.model;

public class Nutritions {
    private int calories;
    private double fat;
    private double sugar;
    private double carbohydrates;
    private double protein;

    public Nutritions(int calories, double fat, double sugar, double carbohydrates, double protein) {
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    public Nutritions() {
    }
}
