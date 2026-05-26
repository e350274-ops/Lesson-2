package com.example.students;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван", "A1", 1, Arrays.asList(4, 3, 5)));
        students.add(new Student("Петр", "A1", 1, Arrays.asList(2, 2, 3)));
        students.add(new Student("Мария", "B1", 2, Arrays.asList(5, 5, 4)));

        StudentService.removeLowGradeStudents(students);
        StudentService.promoteStudents(students);

        System.out.println("Студенты 2 курса:");
        StudentService.printStudents(students, 2);

        System.out.println();

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "12345");
        phoneBook.add("Иванов", "67890");
        phoneBook.add("Петров", "11111");

        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
    }
}