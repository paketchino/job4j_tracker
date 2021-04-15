package ru.job4j.samopoznanye;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int pay = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i <= 4) {
                if (hours[i] <= 8) {
                    pay = hours[i] * 10 + pay;
                } else {
                    pay = 80 + ((hours[i] - 8) * 15) + pay;
                }
            }
            if (i >= 5) {
                if (hours[i] <= 8) {
                    pay = hours[i] * 20 + pay;
                } else  {
                    pay = 160 + ((hours[i] - 8) * 30) + pay;
                }
            }
        }
        return pay;
    }
}
