class Person {
    private String name;
    private int age;
    private static int count = 0;
    public static final String COLLEGE_NAME = "Cambridge Insitiute Of Technology North Campus";
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        System.out.println("Person Constructor Called");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static int getCount() {
        return count;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void displayDetails(String message) {
        System.out.println(message);
        displayDetails();
    }
    static class Department {
        private String departmentName;
        Department(String departmentName) {
            this.departmentName = departmentName;
        }
        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
}
class Student extends Person {
    private int rollNo;
    private String course;
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
        System.out.println("Student Constructor Called");
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        super.displayDetails();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class Faculty extends Person {
    private int facultyId;
    private String subject;
    Faculty(String name, int age,
            int facultyId, String subject) {

        super(name, age);

        this.facultyId = facultyId;
        this.subject = subject;

        System.out.println("Faculty Constructor Called");
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        super.displayDetails();
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Subject: " + subject);
    }
}
class Administrator extends Person {
    private int adminId;
    private String role;
    Administrator(String name, int age, int adminId, String role) {
        super(name, age);
        this.adminId = adminId;
        this.role = role;
        System.out.println("Administrator Constructor Called"
        );
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Administrator Details ---");
        super.displayDetails();
        System.out.println("Admin ID: " + adminId);
        System.out.println("Role: " + role);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("College: " + Person.COLLEGE_NAME);
        Student s = new Student("Vinod", 20, 73, "Computer Science");
        Faculty f = new Faculty("Thejas", 35, 68, "Java Programming");
        Administrator a = new Administrator("Arun", 40, 301, "Principal");
        Person[] people = new Person[3];
        people[0] = s;
        people[1] = f;
        people[2] = a;
        System.out.println("\n=== College Details ===");
        for (int i = 0; i < people.length; i++) {
            people[i].displayDetails();
        }
        System.out.println("\n=== Overloaded Method ===");
        s.displayDetails("Student Information");
        Person.Department d = new Person.Department("Information Technology");
        System.out.println("\n=== Department Details ===");
        d.displayDepartment();
        System.out.println("\nTotal People Created: " + Person.getCount());
    }
}