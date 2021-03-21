package ru.job4j.samopoznanye;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Roman", "Kulyanin", 3);
        Student st2 = new Student("Maksim", "Ragozshkin", 2);
        Student st3 = new Student("Evgenyi", "Nadeev", 1);
        Student st4 = new Student("Petr", "Arsentiev", 4);
        map.put(st1, 7.5);
        map.put(st2, 5.5);
        map.put(st3, 8.5);
        map.put(st4, 1.5);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            Student key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}

    class Student {
        private String name;
        private String surname;
        private int course;

        public Student(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{"
                    + "name='"
                    + name
                    + '\''
                    + ", surname='"
                    + surname
                    + '\''
                    + ", course="
                    + course
                    + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return course == student.course
                    && Objects.equals(name, student.name)
                    && Objects.equals(surname, student.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, course);
        }
    }
