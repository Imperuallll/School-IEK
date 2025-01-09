/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saek.agdim.school1;

import java.util.Arrays;

/**
 *
 * @author GENERAL JOHN
 */
public class Student {
    private String firstName;
    private String lastName;
    private String registrationNumber;
    private Lesson[] lessons;

    public Student(String firstName, String lastName, String registrationNumber, Lesson[] lessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
        this.lessons = lessons;
    }

    public void printDetails() {
        System.out.println("Student: " + firstName + " " + lastName + ", Regist.Kodikos: " + registrationNumber + ", Lessons: " +
                Arrays.toString(Arrays.stream(lessons).map(Lesson::getDescription).toArray()));
                // Το array.stream το πηρα απο w3
    }
    
}
