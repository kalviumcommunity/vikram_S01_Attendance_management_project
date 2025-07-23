package com.school;

public class Student {
    private static int nextStudentIdCounter = 1; // Renamed for clarity and made private

    int studentId;
    String name;

    // Constructor
    public Student(String name) {
        this.studentId = nextStudentIdCounter++; // Auto-increment and assign ID
        this.name = name;                      // Assign name
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
