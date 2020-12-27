package ru.job4j.oop;

/**
 *
 */
public class HierarchyUsage {
    public static void main(String[] args) {
    Freshman freshman = new Freshman();
    Student student = freshman;
    Object obj = freshman;

    Object oFreshman = new Freshman();
    Freshman freshmanFromObject = (Freshman) oFreshman;

    }
}
