package ru.job4j.tracker;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(Object obj) {
        if (obj != null) {
            System.out.println(obj.toString());
        } else {
            System.out.println("null");
        }
        buffer.append(System.lineSeparator());
    }

    public String toSting() {
        return buffer.toString();
    }
}
