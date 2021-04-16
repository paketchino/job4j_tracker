package ru.job4j.streram;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupMethod {

    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
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
            return age == user.age
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{"
                    + "name='" + name + '\''
                    + ", age=" + age
                    + '}';
        }
    }

    public static Map<Integer, List<User>> groupBy(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(
                User::getAge
        ));
    }
}
