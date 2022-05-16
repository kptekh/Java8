package src.main.java.compare;

public class Employee {

    private final int studentId;
    private final String name;
    private final int marks;
    private final String dept;

    public Employee(int studentId, String name, int marks, String dept) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.dept = dept;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", dept='" + dept + '\'' +
                '}';
    }
}
