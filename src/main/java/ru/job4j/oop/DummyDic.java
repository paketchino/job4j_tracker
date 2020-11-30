package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng)  {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic eng = new DummyDic();
        String say = "Неизвестное слово";
        System.out.println(say + eng);

    }
    }
