package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery nokia = new Battery(20);
        Battery samsung = new Battery(50);
        System.out.println("nokia " + nokia.load + " samsung " + samsung.load);
        nokia.exchange(samsung);
        System.out.println("nokia " + nokia.load + " samsung " + samsung.load);
        samsung.exchange(nokia);
        System.out.println(" samsung " + samsung.load + " nokia " + nokia.load);
        System.out.println(" samsung " + samsung.load + " nokia " + nokia.load);
    }
}
