package com.example.designpatterns.builder;

import com.example.designpatterns.builder.components.dishes.Dessert;
import com.example.designpatterns.builder.components.dishes.Drink;
import com.example.designpatterns.builder.components.dishes.MainDish;
import com.example.designpatterns.builder.components.dishes.SideDish;

public class Meal {
    private MainDish mainDish;
    private SideDish sideDish;
    private Dessert dessert;
    private Drink drink;

    public Meal(MainDish mainDish, SideDish sideDish, Dessert dessert, Drink drink) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.dessert = dessert;
        this.drink = drink;
    }

    public MainDish getMainDish() {
        return mainDish;
    }
    public SideDish getSideDish() {
        return sideDish;
    }
    public Dessert getDessert() {
        return dessert;
    }
    public Drink getDrink() {
        return drink;
    }

    
}
