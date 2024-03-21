package com.example.designpatterns.builder;

import com.example.designpatterns.builder.builderInterface.Builder;
import com.example.designpatterns.builder.components.dishes.Dessert;
import com.example.designpatterns.builder.components.dishes.Drink;
import com.example.designpatterns.builder.components.dishes.MainDish;
import com.example.designpatterns.builder.components.dishes.SideDish;

public class MealBuilder implements Builder{
    private MainDish mainDish;
    private SideDish sideDish;
    private Dessert dessert;
    private Drink drink;

    @Override
    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }

    @Override
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Meal getMeal(){
        return new Meal(mainDish, sideDish, dessert, drink);
    }
    
}
