package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    public Lean material(Text text){
        return null;
    }

    class Lean{
        private String book;

        public String getBook() {
            return book;
        }
    }

    class Text{
        private String text;

        public String getText() {
            return text;
        }
    }
}
