import java.util.Scanner;

public class HSUStudentLookup {
    public static void main(String[] args) {
        StudentDB db = new StudentDB();
        Scanner sc = new Scanner(System.in);

        db.addStudent(new Student(1001, "Alice Johnson", "Sophomore", "Computer Science"));
        db.addStudent(new Student(1005, "Bob Smith", "Freshman", "Mathematics"));
        db.addStudent(new Student(1003, "Charlie Brown", "Junior", "Physics"));

        System.out.println("=== Display all students ===");
        db.displayAll();

        System.out.println("\n=== Add a new student ===");
        db.addStudent(new Student(1002, "David Lee", "Senior", "Engineering"));

        System.out.println("\n=== Display all students after adding ===");
        db.displayAll();

        System.out.println("\n=== Find student with ID 1003 ===");
        db.findStudent(1003);

        System.out.println("\n=== Remove student with ID 1005 ===");
        db.removeStudent(1005);

        System.out.println("\n=== Display all students after removal ===");
        db.displayAll();

        sc.close();
    }
}
