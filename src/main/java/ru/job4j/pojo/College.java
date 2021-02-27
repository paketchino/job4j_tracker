package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student s = new Student();
        s.setGroup("16nGN2");
        s.setName("Roman");
        s.setReceipt(new Date());

        System.out.println(s.getGroup() + " " + s.getName() + " " + s.getReceipt());
    }
}
