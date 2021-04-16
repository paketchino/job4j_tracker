package ru.job4j.example;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String st = Integer.toString(i);
        for (int j = 0; j < st.length() / 2; j++) {
            if (st.charAt(j) != st.charAt(st.length() - 1 - j)) {
                rsl = false;
            }
        }
        return rsl;
    }
}
