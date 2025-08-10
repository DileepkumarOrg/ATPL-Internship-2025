public class Student {
    String name;
    int roll;
    static String schoolName = "Z P High School";
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void display(){
        System.out.println("Student Name : "+name+"\nStudent Roll Number : "+roll+"\nSchool Name : "+schoolName);
    }

    public static void main(String[] args) {
        Student studentObject1 = new Student("Dileep", 36);
        Student studentObject2 = new Student("Sandeep", 35);
        studentObject1.display();
        schoolName = "ZPHigh School";
        studentObject2.display();
    }
}


