package ru.job4j.streram;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CountinMethod {
    public static class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Worker {

        private int age;

        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Worker worker = (Worker) o;
            return age == worker.age
                    && Objects.equals(company, worker.company);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, company);
        }
    }

    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.getCompany().getName(),
                        Collectors.counting()
                ));
    }
}
