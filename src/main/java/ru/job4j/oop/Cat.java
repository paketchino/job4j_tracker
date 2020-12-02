package ru.job4j.oop;

public class Cat {

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    private String food;

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.food + ' ' + this.name);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();

        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();

    }
}
