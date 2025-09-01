package com.school;

public class Course implements Storable { // Implements Storable
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }

  
    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }

    @Override
    public String toDataString() {
        // Format: courseId,courseName
        return courseId + "," + courseName;
    }
}

