import java.util.Scanner;

class Student {
    // Private fields for encapsulation
    private String usn;
    private String name;
    private String branch;
    private String phone;

    // Constructor to initialize student details
    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Method to display student details in a cleanly aligned row
    public void display() {
        System.out.printf("%-15s %-20s %-10s %-15s\n", usn, name, branch, phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Robust input loop for N to handle invalid non-integer inputs
        while (true) {
            System.out.print("Enter the number of students (N): ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) {
                    break;
                }
                System.out.println("Please enter a positive integer greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        // Create an array of Student objects
        Student[] students = new Student[n];

        // Read details for N students
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("USN: ");
            String usn = scanner.nextLine().trim();

            System.out.print("Name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Branch: ");
            String branch = scanner.nextLine().trim();

            System.out.print("Phone: ");
            String phone = scanner.nextLine().trim();

            students[i] = new Student(usn, name, branch, phone);
        }

        // Print the details with formatted headings and a professional table layout
        System.out.println("\n============================================================");
        System.out.printf("%-15s %-20s %-10s %-15s\n", "USN", "Name", "Branch", "Phone");
        System.out.println("============================================================");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }
        System.out.println("============================================================");

        // Close scanner to prevent resource leaks
        scanner.close();
    }
}