package org.example.model;

public class Coke extends ProductForSale{

    private int liter;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.liter = 1;
    }

    @Override
    public void showDetails() {
        System.out.println("item " + getType() +" and liter: " + liter + " price: " + getPrice() + " and description: " + getDescription());
    }
}
