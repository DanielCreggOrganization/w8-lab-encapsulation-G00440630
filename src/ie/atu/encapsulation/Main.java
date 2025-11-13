package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 12345, 3.5);
        
        // Type student. and observe autocomplete - all fields are visible
        
        // Set invalid values directly
        student.studentId = -1;  // Invalid ID
        student.gpa = 5.5;        // GPA above 4.0
        
        System.out.println();
        System.out.println("Student: " + student.name);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("GPA: " + student.gpa);

        System.out.println();
        // Create a SecretMessage object
        SecretMessage secret = new SecretMessage("Hello, Encapsulation!");
        // The following line would cause a compile-time error if uncommented:
        // System.out.println(secret.message); // error: message has private access in SecretMessage
        secret.displayMessage();

        System.out.println();
        Temperature temp = new Temperature (25.0);
        temp.setCelsius(25.0);
        System.out.println("Temperature: " + temp.getCelsius() + "°C");

        System.out.println();
        // Grade tests
        System.out.println("=== Valid Grade ===");
        Grade valid = new Grade("John Doe", 85, "CS101");
        System.out.println("Student: " + valid.getStudentName());
        System.out.println("Grade: " + valid.getNumericGrade());
        System.out.println("Course: " + valid.getCourseCode());

        System.out.println();
        System.out.println("=== Invalid Grade (150) ===");
        Grade invalid = new Grade("Jane Smith", 150, "MATH201");
        System.out.println("Student: " + invalid.getStudentName());
        System.out.println("Grade: " + invalid.getNumericGrade());
        System.out.println("Course: " + invalid.getCourseCode());

        System.out.println();
        System.out.println("=== Testing Invalid Setters ===");
        Grade test = new Grade("Alice", 90, "CS101");
        test.setStudentName(""); // invalid
        test.setNumericGrade(-10); // invalid
        test.setCourseCode("123ABC"); // invalid
        System.out.println("Student: " + test.getStudentName());
        System.out.println("Grade: " + test.getNumericGrade());
        System.out.println("Course: " + test.getCourseCode());

        
    }
}
