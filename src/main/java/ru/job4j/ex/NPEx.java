package ru.job4j.ex;

import ru.job4j.pojo.Shop;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Roman";
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null) {
                System.out.println(el + " has a size : " + el.length());
            }
        }
    }
}
