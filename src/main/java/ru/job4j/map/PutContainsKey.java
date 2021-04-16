package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PutContainsKey {

    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User u : list) {
            rsl.put(u.getId(), u);
        }
        return rsl;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User u : list) {
            if (!rsl.containsKey(u.getId())) {
                rsl.put(u.getId(), u);
            }
        }
        return rsl;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}


