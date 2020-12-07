package ru.job4j.oop.inheritance;


public class Programmer extends Engineer {
    public Write canWriteHardcod(Array number){
        return null;
    }

    class Write{
        private int variable;

        public int getVariable() {
            return variable;
        }
    }

    class Array{
        private boolean Length;

        public boolean getArrayLength() {
            return Length;
        }
    }
}
