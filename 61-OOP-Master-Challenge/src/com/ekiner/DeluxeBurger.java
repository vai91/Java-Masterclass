package com.ekiner;

public class DeluxeBurger extends Hamburger{
    private boolean chips;
    private boolean drink;
    private double deluxePrice;
    private String information;

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    public DeluxeBurger(String breadRollType, String meat, double price, String name, boolean chips, boolean drink) {
        super(breadRollType, meat, price, name);
        this.chips = true;
        this.drink = true;
    }

    public double calculatePriceDeluxe() {
        return deluxePrice = super.calculatePrice() + 5;
    }

    public String showPrice(){
        information =   "Base price: 15 zl, \n"+
                "Additionals: \n" +
                "Chips(free) \n" +
                "Drink(free) \n" +
                "Grand Final Total: " + calculatePriceDeluxe();
        return information;
    }
}
