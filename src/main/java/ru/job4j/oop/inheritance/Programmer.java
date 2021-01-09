package ru.job4j.oop.inheritance;


public class Programmer extends Engineer {
    private String writeCod;

    public Programmer (String n, String sn, String bd, String e) {
        super(n, sn, bd, e);
    }
    public Programmer(String n, String sn, String bd, String e, String writeCod) {
        super(n, sn, bd, e);
        this.writeCod = writeCod;
    }
}
