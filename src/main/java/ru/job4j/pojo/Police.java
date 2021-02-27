package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License l = new License();
        l.setCode("1111");
        l.setCreated(new Date());
        l.setModel("Toyota");
        l.setOwner("Prosto Roman");

        System.out.println(l.getOwner() + "has a car -  " + l.getModel() + " : " + l.getCode());
    }
}
