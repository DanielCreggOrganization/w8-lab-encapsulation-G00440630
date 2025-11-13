package ie.atu.encapsulation;

public class Grade {
    private String studentName;
    private int numericGrade;
    private String courseCode;

    public Grade(String studentName, int numericGrade, String courseCode) {
        this.studentName = validateStudentName(studentName);
        this.numericGrade = validateGrade(numericGrade);
        this.courseCode = validateCourseCode(courseCode);
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public int getNumericGrade() {
        return numericGrade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // Setters that use validation helpers
    public void setStudentName(String name) {
        this.studentName = validateStudentName(name);
    }

    public void setNumericGrade(int grade) {
        this.numericGrade = validateGrade(grade);
    }

    public void setCourseCode(String code) {
        this.courseCode = validateCourseCode(code);
    }

    // Validation helpers
    private String validateStudentName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid student name: cannot be empty. Name set to \"Unknown\".");
            return "Unknown";
        }
        return name;
    }

    private int validateGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade: must be between 0 and 100. Grade set to 0.");
            return 0;
        }
        return grade;
    }

    private String validateCourseCode(String code) {
        if (code == null) {
            System.out.println("Invalid course code format. Code set to \"UNKNOWN\".");
            return "UNKNOWN";
        }
        // 2-3 letters followed by 3 digits, e.g., CS101 or MTH201
        if (code.matches("^[A-Za-z]{2,3}\\d{3}$")) {
            return code;
        } else {
            System.out.println("Invalid course code format. Code set to \"UNKNOWN\".");
            return "UNKNOWN";
        }
    }
}
