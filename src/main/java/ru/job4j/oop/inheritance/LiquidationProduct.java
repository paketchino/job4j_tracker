package ru.job4j.oop.inheritance;

public final class LiquidationProduct  {
    private Product product;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public int discount() {
        return 90;
    }


    public String label() {
        return null;
    }
}
