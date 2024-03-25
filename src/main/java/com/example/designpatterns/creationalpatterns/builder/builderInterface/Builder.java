package com.example.designpatterns.creationalpatterns.builder.builderInterface;

import com.example.designpatterns.creationalpatterns.builder.components.dishes.Dessert;
import com.example.designpatterns.creationalpatterns.builder.components.dishes.Drink;
import com.example.designpatterns.creationalpatterns.builder.components.dishes.MainDish;
import com.example.designpatterns.creationalpatterns.builder.components.dishes.SideDish;

public interface Builder {
    void setMainDish(MainDish mainDish);
    void setSideDish(SideDish sideDish);
    void setDessert(Dessert dessert);
    void setDrink(Drink drink);
}
