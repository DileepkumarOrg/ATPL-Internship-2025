import java.util.*;

public class Student {
    int id;
    String name;
    int age;
    int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }

    public static class SortByName implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    public static class SortByAge implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.age, s2.age);
        }
    }

    public static class SortByMarks implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return Integer.compare(s2.marks, s1.marks);
        }
    }

    public static class SortById implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.id, s2.id);
        }
    }

    public static class SortByMarksThenName implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            int markCompare = Integer.compare(s2.marks, s1.marks);
            if (markCompare != 0) {
                return markCompare;
            } else {
                return s1.name.compareTo(s2.name);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dileep", 21, 95));
        students.add(new Student(2, "Naveen", 22, 96));
        students.add(new Student(3, "Mahesh", 20, 92));
        students.add(new Student(4, "Sandeep", 24, 85));
        students.add(new Student(5, "Hemanth", 25, 95));

        System.out.println("Name (alphabetically): ");
        Collections.sort(students, new SortByName());
        students.forEach(System.out::println);

        System.out.println("\nMarks (descending): ");
        Collections.sort(students, new SortByMarks());
        students.forEach(System.out::println);

        System.out.println("\nAge (ascending): ");
        Collections.sort(students, new SortByAge());
        students.forEach(System.out::println);

        System.out.println("\nMarks (descending), then Name (ascending): ");
        Collections.sort(students, new SortByMarksThenName());
        students.forEach(System.out::println);
    }
}