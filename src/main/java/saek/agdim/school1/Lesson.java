/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saek.agdim.school1;

/**
 *
 * @author GENERAL JOHN
 */
public class Lesson {
    private String code;
    private String description;
    private Classroom classroom;

    public Lesson(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getDescription() {
        return description;
    }

    public void printDetails() {
        System.out.println("Lesson: " + code + " - " + description + ", Classroom: " + classroom.getDescription());
    }
    
}
