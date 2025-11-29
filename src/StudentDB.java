import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDB {
    private ArrayList<Student> students;

    public StudentDB() {
        students = new ArrayList<>();
    }

    private void sortStudents() {
        Collections.sort(students, Comparator.comparingInt(s -> s.studentId));
    }

    private int binarySearch(int studentId) {
        int left = 0;
        int right = students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (students.get(mid).studentId == studentId) {
                return mid;
            } else if (students.get(mid).studentId < studentId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void addStudent(Student s) {
        if (binarySearch(s.studentId) != -1) {
            System.out.println("Error: Student ID " + s.studentId + " already exists.");
            return;
        }
        students.add(s);
        sortStudents();
        System.out.println("Student " + s.name + " added successfully.");
    }

    public void removeStudent(int studentId) {
        int idx = binarySearch(studentId);
        if (idx == -1) {
            System.out.println("Error: Student ID " + studentId + " not found.");
        } else {
            Student removed = students.remove(idx);
            System.out.println("Student " + removed.name + " removed successfully.");
        }
    }

    public void findStudent(int studentId) {
        int idx = binarySearch(studentId);
        if (idx == -1) {
            System.out.println("Student ID " + studentId + " not found.");
        } else {
            System.out.println(students.get(idx));
        }
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students in database.");
        } else {
            System.out.println("All students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}