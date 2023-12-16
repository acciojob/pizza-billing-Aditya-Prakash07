package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese(); // Deluxe Pizza comes with extra cheese by default
        addExtraToppings(); // Deluxe Pizza comes with extra toppings by default
    }
}
