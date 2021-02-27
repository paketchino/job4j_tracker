package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String n, String sn, String bd, String e, String d) {
        super(n, sn, bd, e, d);
    }

    public Surgeon(String n, String sn, String bd, String e, String d, String operation) {
        super(n, sn, bd, e, d);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
//2
