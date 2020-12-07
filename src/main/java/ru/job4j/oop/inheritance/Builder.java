package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    public Draw drawing(Sheet sheet) {
        return null;
    }

    class Draw{
        private String pencil;

        public String getPencil() {
            return pencil;
        }
    }

    class Sheet{
        private String table;

        public String getTable(){
            return table;
        }
    }
}
