/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saek.agdim.school1;

/**
 *
 * @author GENERAL JOHN
 */
public class Classroom {
    private String kodikos;
    private String description;

    public Classroom(String code, String description) {
        this.kodikos = kodikos;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void printDetails() {
        System.out.println("Classroom: " + kodikos + " - " + description);
    }
    
}
