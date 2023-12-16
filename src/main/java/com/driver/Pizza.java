package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400; // Set base price based on veg or non-veg
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;
        generateBill();
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.price += 80;
            extraCheeseAdded = true;
            generateBill();
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            this.price += isVeg ? 70 : 120;
            extraToppingsAdded = true;
            generateBill();
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            this.price += 20;
            takeawayAdded = true;
            generateBill();
        }
    }

    public String getBill() {
        return this.bill;
    }

    private void generateBill() {
        StringBuilder billBuilder = new StringBuilder();
        billBuilder.append("Base Price Of The Pizza: ").append(isVeg ? 300 : 400).append("\n");
        if (extraCheeseAdded) {
            billBuilder.append("Extra Cheese Added: 80\n");
        }
        if (extraToppingsAdded) {
            billBuilder.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        }
        if (takeawayAdded) {
            billBuilder.append("Paperbag Added: 20\n");
        }
        billBuilder.append("Total Price: ").append(price).append("\n");
        this.bill = billBuilder.toString();
    }
}
