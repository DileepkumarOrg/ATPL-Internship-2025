public class Person {
    public void walk(){
        System.out.println("Walking...");
    }
}

class Teacher extends Person{
    public void teaching (){
        System.out.println("Teacher is Teaching ...");
    }
}

class Student extends Person{
    public void listening(){
        System.out.println("Student is listening");
    }
}

class Main {
    public static void main(String[] args) {
        Teacher teacherObj = new Teacher();
        Student studentobj = new Student();
        teacherObj.walk();
        teacherObj.teaching();
        studentobj.walk();
        studentobj.listening();
    }

    
}
