package ru.job4j.ex;

public class User {
    private String username;
    private  boolean valid;

    public User(String username, boolean invalid)
    {
        this.username = username;
        this.valid = invalid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}
