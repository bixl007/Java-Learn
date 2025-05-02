import java.util.TreeSet;

class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name='" + name + "'}";
    }
}

public class _012_TreeSetComparable {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(10, "Alice"));
        students.add(new Student(5, "Bob"));
        students.add(new Student(15, "Charlie"));
        students.add(new Student(7, "David"));

        System.out.println("Students (sorted by roll):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
