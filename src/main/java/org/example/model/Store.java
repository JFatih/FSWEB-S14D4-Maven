package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale bread = new Bread("Bread", 15, "for eating with meal");
        ProductForSale coke = new Coke("Coca Cola", 50, "for drink with meal");
        ProductForSale chocolate = new Chocolate("Ulker Chocolate wafer", 15, "for like dessert after the meal");
        ProductForSale[] items = {bread,coke,chocolate};
        listProducts(items);

        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale items : products ){
           items.showDetails();
        }
    }
}