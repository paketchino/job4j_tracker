package ru.job4j.Example;

public class Cryptography {
    public static String code(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        String rsl = "";
        if (s.equals("")) {
            return "Empty";
        } else {
            for (int i = 0; i < s.length() - 4; i++) {
                sb.setCharAt(i,'#');
            }
        }
        if (s.length() > 0 && s.length() < 4) {
            return s;
        }
        return rsl;
    }
}
