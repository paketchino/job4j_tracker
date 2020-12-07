package ru.job4j.oop.inheritance;

public class HtmlReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "h1" + name + "</р1>" +
                "<b/r>" +
                "<span>" + body + "</span>";
    }

}
