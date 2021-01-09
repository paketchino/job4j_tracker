package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String diagnose;

    public Doctor (String n, String sn, String bd, String e) {
        super(n, sn, bd, e);
    }

    public Doctor (String n, String sn, String bd, String e, String diagnose) {
        super(n, sn, bd, e);
        this.diagnose = diagnose;
    }
    public String getDiagnose(){
        return null;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
