package ru.job4j.streram;

import java.util.List;
import java.util.stream.Collectors;

public class OptinalStream {

    public static class PhoneNumber
    {
        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }
    }


    public static class User
    {
        private int id;
        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNmber(List<User> users, int id, String region)
    {
        return users.stream()
                .filter(id1 -> id1.getId() == id)
                .findFirst()
                .stream()
                .flatMap(user -> user.getNumbers().stream())
                        .filter(ph -> ph.getPhone().startsWith(region))
                        .collect(Collectors.toList());
    }
}
