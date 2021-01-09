package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String logicalThinking;

    public Engineer(String n, String sn, String bd, String e){
        super(n, sn, bd, e);
    }

    public Engineer(String n, String sn, String bd, String e, String lt, String logicalThinking){
        super(n, sn, bd, e);
        this.logicalThinking = lt;
    }
    public String getLogicalThinking() {
        return logicalThinking;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
