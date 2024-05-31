package org.example.model;

public class Chocolate extends ProductForSale{

    private int grammage;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.grammage = 150;
    }

    @Override
    public void showDetails() {
        System.out.println("item " + getType() +" and grammage: " + grammage + " price: " + getPrice() + " and description: " + getDescription());
    }
}
