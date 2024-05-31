package org.example.model;

public class Bread extends ProductForSale{

    private int grammage;

    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.grammage = 200;
    }

    @Override
    public void showDetails() {
        System.out.println("item " + getType() +" and grammage: " + grammage + " price: " + getPrice() + " and description: " + getDescription());
    }
}
