package com.example.designpatterns.builder;

import com.example.designpatterns.builder.components.dishes.Drink;
import com.example.designpatterns.builder.components.dishes.MainDish;
import com.example.designpatterns.builder.components.dishes.SideDish;

public class Demo {
    public static void main(String[] args) {

        //* Using a director
        MealDirector director = new MealDirector();
        MealBuilder builder = new MealBuilder();
        director.constructStreetwiseThree(builder);

        Meal firstMeal = builder.getMeal();
        System.out.println(firstMeal.getMainDish().getName());
        System.out.println(firstMeal.getSideDish().getName());
        System.out.println(firstMeal.getDrink().getName());
        System.out.println(firstMeal.getDessert().getName());

        //* Using the builder directly
        MealBuilder seconBuilder = new MealBuilder();
        seconBuilder.setMainDish(new MainDish("Pizza", null, null));
        seconBuilder.setSideDish(new SideDish("Garlic Bread", null, null));
        seconBuilder.setDrink(new Drink("Sprite", null, null));
        Meal secondMeal = seconBuilder.getMeal();

        System.out.println(secondMeal.getMainDish().getName());
        System.out.println(secondMeal.getSideDish().getName());
        System.out.println(secondMeal.getDrink().getName());
    }
}
