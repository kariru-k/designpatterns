package com.example.designpatterns.creationalpatterns.builder.components.dishes;

public class SideDish implements Dish{
    private String name;
    private String description;
    private String dietaryInformation;

    public SideDish(String name, String description, String dietaryInformation) {
        this.name = name;
        this.description = description;
        this.dietaryInformation = dietaryInformation;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getDietaryInformation() {
        return this.dietaryInformation;
    }
}
