package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 12345, 3.5);
        
        // Type student. and observe autocomplete - all fields are visible
        
        // Set invalid values directly
        student.studentId = -1;  // Invalid ID
        student.gpa = 5.5;        // GPA above 4.0
        
        System.out.println("Student: " + student.name);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("GPA: " + student.gpa);
    }
}
