package ru.job4j.map;

import java.util.Map;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Student findByAccount(String account) {
        for (Student s : students.keySet()) {
            if (s.getAccount().equals(account)) {
                return s;
            }
        }
        return null;
    }

    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            Set<Subject> subjects = students.get(a);
            for (Subject s : subjects) {
                if (s.getName().equals(name)) {
                    return s;
                }
            }
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
