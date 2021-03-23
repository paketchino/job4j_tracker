package ru.job4j.map;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Student findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.getAccount().equals(account))
                .findFirst().orElse(null);
        }

    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            return students.get(a)
                    .stream()
                    .filter(s -> s.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> studentSetMap = Map.of(
                new Student("Student", "00001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 80))
        );

        College college = new College(studentSetMap);
        Student student = college.findByAccount("00001");
        System.out.println("Found student: " + student);
        Subject subject = college.findBySubjectName("00001", "English");
        System.out.println("Score found of subject: " + subject);

    }
}
