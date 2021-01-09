package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private String teeth;

    public Dentist (String n, String sn, String bd, String e, String d) {
        super(n, sn, bd, e, d);
    }

    public Dentist (String n, String sn, String bd, String e, String d, String teeth) {
        super(n, sn, bd, e, d);
        this.teeth = teeth;
    }

    public String getTeeth() {
        return null;
    }
}
