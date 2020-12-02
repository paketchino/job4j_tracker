package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "Ешал грека через реку";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic cat = new DummyDic();
        String say = cat.engToRus();
        System.out.println("Неизвестное слово " + say);
    }

    }
