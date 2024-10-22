public class SRP {
    /*
    A class should have one and only one reason to change,
    meaning it should only have one responsibility.
     */
}

class ReportGenerator {
    public String generateReport() {
        // Code to generate a report
        return "Report Data";
    }
}

class ReportPrinter {
    public void printReport(String report) {
        // Code to print the report
        System.out.println("Printing: " + report);
    }
}

