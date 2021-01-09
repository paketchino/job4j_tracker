package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String tools;

    public Builder(String n, String sn, String bd, String e) {
        super(n, sn, bd, e);
    }

    public Builder(String n, String sn, String bd, String e, String t, String tools) {
        super(n, sn, bd, e);
        this.tools = tools;
    }

    public String getTools() {
        return tools;
    }
}
//2
