package com.example.designpatterns.builder;

import com.example.designpatterns.builder.builderInterface.Builder;
import com.example.designpatterns.builder.components.dishes.Dessert;
import com.example.designpatterns.builder.components.dishes.Drink;
import com.example.designpatterns.builder.components.dishes.MainDish;
import com.example.designpatterns.builder.components.dishes.SideDish;

public class MealDirector {
    public void constructStreetwiseThree(Builder builder){
        builder.setDrink(new Drink("Soda", "A Nice Soda", "Sugary Drink"));
        builder.setMainDish(new MainDish("Three Pieces of Chicken", "Kentucky Fried Chicken", "Protein"));
        builder.setDessert(new Dessert("Cake", "Chocolate Cake", "Sugar and egg cake"));
        builder.setSideDish(new SideDish("Fries", "Potato fries", "Carbs"));
    }
}
