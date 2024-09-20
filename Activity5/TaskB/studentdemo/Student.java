package studentdemo;


public class Student {
    protected String name; // Student's name
    protected int id;      // Student's ID

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}
