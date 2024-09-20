package studentdemo;


public class StudentDemo {

    public static void main(String[] args) {
      // Polymorphism with InternationalStudent
        Student intStudent = new InternationalStudent("John Doe", 101, "Canada", 4);
        System.out.println("International Student Info:");
        intStudent.displayInfo();
        System.out.println("-------------------------------");

        // Polymorphism with OnlineStudent
        OnlineTool tool = new OnlineTool("Zoom");
        Student onlineStudent = new OnlineStudent("Jane Smith", 202, tool, 2);
        System.out.println("Online Student Info:");
        onlineStudent.displayInfo();
        System.out.println("-------------------------------");

        // Changing a Student object between different behaviors
        System.out.println("Changing Student Object Behavior:");
        Student student = new InternationalStudent("Alice Johnson", 303, "Australia", 3);
        student.displayInfo();
        System.out.println("-------------------------------");

        // Now making the same object behave like an OnlineStudent
        student = new OnlineStudent("Alice Johnson", 303, new OnlineTool("Google Meet"), 1);
        student.displayInfo();
    }
}
