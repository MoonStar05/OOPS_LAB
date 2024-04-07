package WEEK_03;
public class Student {


    private String name;
    private int rollNo;
    private static String collegeName;

    public Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }

    public static void setCollegeName(String studentCollegeName) {
        collegeName = studentCollegeName;
    }

    public String getStudentInfo() {
        return "Name: " + name + "\nRoll No: " + rollNo + "\nCollege Name: " + collegeName;
    }

    public static void main(String[] args) {
        // Setting initial college name
        setCollegeName("NIT ANDHRA");

        // Creating a student instance
        Student student = new Student("Erick John", 12345);

        // Displaying student information with the static college name
        System.out.println(student.getStudentInfo());

        // Updating college name
        setCollegeName("Harvard");

        // Displaying student information with the updated college name
        System.out.println("\nUpdated Student Information:\n" + student.getStudentInfo());
    }

}
