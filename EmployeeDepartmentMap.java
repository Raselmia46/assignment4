import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDepartmentMap {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();

        // Input Employee ID and Department
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();
            employeeMap.put(empId, department);
        }

        // Display all entries
        System.out.println("\nEmployee ID to Department Map:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Department: " + entry.getValue());
        }

        // Optional: Lookup
        System.out.print("\nEnter Employee ID to search: ");
        int searchId = scanner.nextInt();
        String dept = employeeMap.get(searchId);
        if (dept != null) {
            System.out.println("Employee ID " + searchId + " belongs to Department: " + dept);
        } else {
            System.out.println("Employee ID not found.");
        }

        scanner.close();
    }
}
