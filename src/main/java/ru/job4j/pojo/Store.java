package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product cheese = new Product("cheese", 15);
        Product apple = new Product("apple", 5);
        Product[] prods = new Product[3];
        prods[0] = milk;
        prods[1] = cheese;
        prods[2] = apple;
        for (int i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            System.out.println(pr.getName() + " " + pr.getCount());
        }
        System.out.println("Replace milk to oil");
        Product oil = new Product("oil", 30);
        prods[0] = oil;
        for (int i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            System.out.println(pr.getName() + " " + pr.getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (int i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " " + pr.getCount());
            }
        }
    }
}
