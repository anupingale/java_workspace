package com.step.pizza;

public enum Topping {

    VEGETABLE(20,"Vegetables"),
    CHICKEN(30,"Chicken"),
    MOZZARELLA(10,"Mozzarella"),
    TOMATO_SAUCE(5,"Tomato sauce"),
    EXTRA_CHEESE(25,"Extra cheese"),
    JALAPENO(40,"Jalapeno");

    final String name;
    final Integer price;

    Topping(int price,String name) {
        this.price = price;
        this.name = name;
    }
}
