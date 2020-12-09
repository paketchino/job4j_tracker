package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon (String n, String sn, String bd, String e, String d) {
        super(n, sn, bd, e, d);
    }

    public Surgeon (String n, String sn, String bd, String e, String d, String o) {
        super(n, sn, bd, e, d);
        this.operation = o;
    }

    public String getOperation() {
        return operation;
    }
}
