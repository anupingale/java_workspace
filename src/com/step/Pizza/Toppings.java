package com.step.pizza;

import java.util.ArrayList;
import java.util.List;

class Toppings {

    private List<Topping> toppings;

    Toppings() {
        toppings = new ArrayList<>();
    }

    void add(Topping topping) {
        toppings.add(topping);
    }

    Integer getTotalPrice() {
        Integer totalPrice = 0;
        for (Topping topping : toppings) totalPrice = totalPrice + topping.price;
        return totalPrice;
    }

    String formatString(Topping topping) {
        StringBuilder toppingDetails = new StringBuilder();
        String formatter = " : ";
        String newLine = "\n";
        toppingDetails.append(topping.name).append(formatter).append(topping.price).append(newLine);
        return toppingDetails.toString();
    }

    String getToppingDetails() {
        StringBuilder toppingDetails = new StringBuilder();
        for (Topping topping : toppings) toppingDetails.append(formatString(topping));
        return toppingDetails.toString();
    }
}
