package com.modernjava.domain;

/**
 * Student domain class representing a student with name, grade, and subject
 * Used for demonstrating stream aggregate operations and data analysis
 */
public class Student {
    private final String name;
    private final int grade;
    private final String subject;

    public Student(String name, int grade, String subject) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return name + " (" + subject + "): " + grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return grade == student.grade &&
               name.equals(student.name) &&
               subject.equals(student.subject);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, grade, subject);
    }
}
