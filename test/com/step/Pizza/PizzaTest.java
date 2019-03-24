package com.step.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {
    @Test
    void shouldReturnPizzaOPizza() {
        Pizza pizza = new Pizza();
        assertEquals(50, pizza.getTotalPrice());
    }

    @Test
    void shouldAddToppingToPizzaAndReturnTotalPrice() {
        Pizza pizza = new Pizza();
        pizza.add(Topping.VEGETABLE);
        assertEquals(70, pizza.getTotalPrice());
    }

    @Test
    void shouldReturnThePizzaOrderDetails() {
        Pizza pizza = new Pizza();
        pizza.add(Topping.EXTRA_CHEESE);
        pizza.add(Topping.MOZZARELLA);
        String expected = "Pizza : 50\n" + "Extra cheese : 25\n" + "Mozzarella : 10\n" + "Total price : 85";
        assertEquals(expected, pizza.getPizzaDetails());
    }
}