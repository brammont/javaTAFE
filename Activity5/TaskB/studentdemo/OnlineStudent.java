package studentdemo;

public class OnlineStudent extends Student {
    private OnlineTool tool;  // Name of the online tool used by the student
    private int studyPeriod;  // Study period in years

    // Constructor
    public OnlineStudent(String name, int id, OnlineTool tool, int studyPeriod) {
        super(name, id);  // Call to superclass constructor
        this.tool = tool;
        this.studyPeriod = studyPeriod;
    }

    // Overridden method to display online student details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call superclass method
        System.out.println("Online Tool: " + tool.getToolName());
        System.out.println("Study Period: " + studyPeriod + " years");
    }
}

