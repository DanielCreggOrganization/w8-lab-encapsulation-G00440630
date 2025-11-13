package ie.atu.encapsulation;

public class Student {
    public String name;
    public int studentId;
    public double gpa;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
}
