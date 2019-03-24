package com.step.pizza;

class Pizza {

    private Toppings topping;
    private final Integer basePrice;

    Pizza() {
        this.topping = new Toppings();
        this.basePrice = 50;
    }

    void add(Topping topping) {
        this.topping.add(topping);
    }

    public Integer getTotalPrice() {
        return this.basePrice + this.topping.getTotalPrice();
    }

    String getPizzaDetails() {
        Integer totalPrice = this.basePrice + this.topping.getTotalPrice();
        String toppingDetails = this.topping.getToppingDetails();
        String pizzaDetails = String.format("Pizza : %d\n", basePrice);
        return String.format("%s%sTotal price : %d", pizzaDetails, toppingDetails, totalPrice);
    }
}
