package studentdemo;

public class InternationalStudent extends Student {
    private String countryName; // Student's country
    private int visaPeriod;     // Visa period in years

    // Default constructor
    public InternationalStudent() {
        super("Unknown", 0);  // Call to superclass constructor
        this.countryName = "Unknown";
        this.visaPeriod = 0;
    }

    // Overloaded constructor
    public InternationalStudent(String name, int id, String countryName, int visaPeriod) {
        super(name, id);
        this.countryName = countryName;
        this.visaPeriod = visaPeriod;
    }

    // Overridden method to display international student details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call superclass method
        System.out.println("Country: " + countryName);
        System.out.println("Visa Period: " + visaPeriod + " years");
    }
}

