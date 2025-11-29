import java.util.Scanner;

public class HSUStudentLookup {
    public static void main(String[] args) {
        StudentDB db = new StudentDB();
        Scanner sc = new Scanner(System.in);

        db.addStudent(new Student(1001, "name1", "Sophomore", "Computer Science"));
        db.addStudent(new Student(1002, "name2", "Freshman", "Mathematics"));
        db.addStudent(new Student(1003, "name3", "Junior", "Physics"));

        System.out.println("Display all students");
        db.displayAll();

        System.out.println("\n Add a new student ");
        db.addStudent(new Student(1234, "name4", "Senior", "Engineering"));

        System.out.println("\n Display all students after adding ");
        db.displayAll();

        System.out.println("\n Find student with ID 1003 ");
        db.findStudent(1003);

        System.out.println("\n Remove student with ID 1002 ");
        db.removeStudent(1002);

        System.out.println("\n Display all students after removal ");
        db.displayAll();

        sc.close();
    }
}
