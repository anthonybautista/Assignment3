package edu.wctc;

public class Product extends Asset implements Sellable {
    private int quantity;
    private String sku;
    private String name;
    private double cost;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int quantity, String sku, String name, double cost) {
        this.quantity = quantity;
        this.sku = sku;
        this.name = name;
        this.cost = cost;
    }

    public String getSku() {
        return sku;
    }

    @Override
    public boolean isAvailable(int quantity) {
        return quantity > 0;
    }

    @Override
    public String toString() {
        return "Product SKU: " + sku +
                "\nProduct Name: " + name +
                "\nProduct Cost: " + cost +
                "\nUnits in Stock: " + quantity;
    }
}
