package ru.job4j.oop.inheritance;

public final class LiquidationProduct  {
    private Product product;

    public LiquidationProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int discount() {
        return 90;
    }

    @Override
    public String label() {
        return name + " " + price();
    }
}
