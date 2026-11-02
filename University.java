class University {
    String university_Name;
    University(String university_Name) {
        this.university_Name = university_Name;
    }
    static class Department {
        String department_Name;
        Department(String department_Name) {
            this.department_Name =department_Name;
        }
        void displayDepartment() {
            System.out.println("Department: " + department_Name);
        }
    }
    class Faculty {
        String faculty_Name;
        String designation;
        Faculty(String faculty_Name, String designation) {
            this.faculty_Name = faculty_Name;
            this.designation = designation;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + faculty_Name);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + university_Name);
        }
    }
    void displayUniversity() {
        System.out.println("University Name: " + university_Name);
    }
    public static void main(String[] args) {
        University u = new University("ABC University");
        University.Department d = new University.Department("Computer Science");
        University.Faculty f = u.new Faculty("Rahul", "Assistant Professor");
        System.out.println("--- University Details ---");
        u.displayUniversity();
        System.out.println("\n--- Department Details ---");
        d.displayDepartment();
        System.out.println("\n--- Faculty Details ---");
        f.displayFaculty();
    }
}
