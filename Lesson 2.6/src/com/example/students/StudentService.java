package com.example.students;

import java.util.Iterator;
import java.util.Set;

public class StudentService {

    public static void removeLowGradeStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}