/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saek.agdim.school1;

/**
 *
 * @author GENERAL JOHN
 */
public class Teacher {
    private String firstName;
    private String lastName;
    private String amka;
    private Lesson lesson;

    public Teacher(String firstName, String lastName, String amka, Lesson lesson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.amka = amka;
        this.lesson = lesson;
    }

    public void printDetails() {
        System.out.println("Teacher: " + firstName + " " + lastName + ", AMKA: " + amka + ", Lesson: " + lesson.getDescription());
    }
    
}
