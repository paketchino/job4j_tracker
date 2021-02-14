package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setCode("1111");
        license.setCreated(new Date());
        license.setModel("Toyota");
        license.setOwner("Prosto Roman");

        System.out.println(license.getOwner() + "has a car -  " + license.getModel() + " : " + license.getCode());
    }
}
