package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    public Treat teeth(Pacient pacient) {
        return null;
    }

    class Treat{
        private String equipment;

        public String getEquipment() {
            return equipment;
        }
    }
}
