package com.ekiner;

public class HealthyBurger extends Hamburger{
    private boolean onion;
    private boolean driedTomato;
    private double healtyPrice;
    private String information;

    public HealthyBurger(String meat, double price, String name) {
        super("brown rye bread roll", meat, price, name);
    }

    public HealthyBurger(String meat, double price, String name, boolean lettuce, boolean carrot, boolean tomato, boolean cheese, boolean onion, boolean driedTomato) {
        super("brown rye bread roll", meat, price, name, lettuce, carrot, tomato, cheese);
        this.onion = onion;
        this.driedTomato = driedTomato;

    }

    public double calculatePriceHealthy() {
        healtyPrice = super.calculatePrice() + 2;
        if (onion || driedTomato) {
            if (onion) {
                healtyPrice += 0.5;
            }
            if (driedTomato) {
                healtyPrice += 0.5;
            }
        }
        return healtyPrice;
    }

    public String showPrice(){
        information =   "Base price: 12 zl, \n"+
                "Additionals: \n" +
                "Lettuce(0.5zl) \n" +
                "Carrot(0.5zl) \n" +
                "Tomato(0.5zl) \n" +
                "Cheese(1zl) \n" +
                "Onion(0.5zl) \n" +
                "Dried Tomato(0.5zl) \n" +
                "Grand Final Total: " + calculatePriceHealthy();
        return information;
    }

}
