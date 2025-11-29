public class Student {
    int studentId;
    String name;
    String year;
    String major;

    public Student(int studentId, String name, String year, String major) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
        this.major = major;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Year: " + year + ", Major: " + major;
    }
}
