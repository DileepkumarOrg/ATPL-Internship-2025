class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name; 
        this.age = age;   
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeywordClass {
    public static void main(String[] args) {
        Student s1 = new Student("Dileep", 22);
        Student s2 = new Student("Sandeep", 24);

        s1.display();
        s2.display();
    }
}
