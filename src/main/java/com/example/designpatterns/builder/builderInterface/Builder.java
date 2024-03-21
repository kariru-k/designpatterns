package com.example.designpatterns.builder.builderInterface;

import com.example.designpatterns.builder.components.dishes.Dessert;
import com.example.designpatterns.builder.components.dishes.Drink;
import com.example.designpatterns.builder.components.dishes.MainDish;
import com.example.designpatterns.builder.components.dishes.SideDish;

public interface Builder {
    void setMainDish(MainDish mainDish);
    void setSideDish(SideDish sideDish);
    void setDessert(Dessert dessert);
    void setDrink(Drink drink);
}
