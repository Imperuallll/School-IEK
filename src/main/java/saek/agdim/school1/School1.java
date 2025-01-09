/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saek.agdim.school1;

/**
 *
 * @author GENERAL JOHN
 */
public class School1 {

    public static void main(String[] args) {
        //public static void main(String[] args) {
           Lesson lesson1 = new Lesson("M1", "Mathimatika");
           Lesson lesson2 = new Lesson("M2", "Diktua Ypologistwn");
          Lesson lesson3 = new Lesson("M3", "Xhmeia");
          Lesson lesson4 = new Lesson("M4", "Java ");
          Lesson lesson5 = new Lesson("M5", "Istoria");
         //m= mathima 
         
        // Taks= taksh 
         Classroom class1 = new Classroom("Taks1", "ethousa 1");
        Classroom class2 = new Classroom("Taks2", "ethousa 2");
        Classroom class3 = new Classroom("Taks3", "ethousa 3");
        Classroom class4 = new Classroom("Taks4", "ethousa 4");
        Classroom class5 = new Classroom("Taks5", "ethousa 5");

        
          lesson1.setClassroom(class1);
           lesson2.setClassroom(class2);
           lesson3.setClassroom(class3);
           lesson4.setClassroom(class4);
            lesson5.setClassroom(class5);

        
        Teacher teacher1 = new Teacher("John", "sounas", "1235465989", lesson1);
        Teacher teacher2 = new Teacher("maria", "papadopoulou", "9321", lesson2);
         Teacher teacher3 = new Teacher("Giorgos", "mat", "4123", lesson3);
        Teacher teacher4 = new Teacher("Mixalhs", "kokkinos", "789156", lesson4);
        Teacher teacher5 = new Teacher("Mani", "aroutis", "321657", lesson5);

        // epanalipsh gia grhgorh egrafh mathitwn
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            
            
            students[i] = new Student("Mathiths", "Number" + (i + 1), "AM" + (i + 1),
                    new Lesson[]{lesson1, lesson2, lesson3, lesson4, lesson5});
        }

        
        System.out.println("Teachers:");
               teacher1.printDetails();
                teacher2.printDetails();
                teacher3.printDetails();
                teacher4.printDetails();
                teacher5.printDetails();

       
        System.out.println("\nStudents:");
        for (Student student : students) {
            student.printDetails();
        }
    }
}
