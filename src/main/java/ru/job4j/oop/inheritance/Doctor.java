package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    public Diagnose heal(Pacient pacient) {
        return null;
    }

    class Diagnose {
        private String disease;

        public String getDisease() {
            return disease;
        }
    }

    class Pacient{
        private String name;
        private String symptoms;

        public String getName() {
            return name;
        }

        public String getSymptoms(){
            return symptoms;
        }
    }
}
