package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    public Can makeOperation(Dog dog) {
        return null;
    }

    class Can{
        private String operationHeart;

        public String getOperationHeart() {
            return operationHeart;
        }
    }
    class Dog{
        private String injury;

        public String getInjury() {
            return injury;
        }
    }

}
