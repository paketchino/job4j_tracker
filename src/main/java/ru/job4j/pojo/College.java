package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setGroup("16nGN2");
        student.setName("Roman");
        student.setReceipt(new Date());


        System.out.println(student.getGroup() + " " + student.getName() + " " + student.getReceipt());
    }
}
