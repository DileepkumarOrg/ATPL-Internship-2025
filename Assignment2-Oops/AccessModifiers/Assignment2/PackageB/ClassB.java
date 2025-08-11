package PackageB;
import PackageA.*;

public class ClassB {
    public static void main(String[] args) {
        ClassB publicClassObj = new ClassB(); 
        publicClassObj.defaultMethod();         //The method defaultMethod() is undefined for the type ClassB
        publicClassObj.protectedMethod();       //The method protectedMethod() is undefined for the type ClassB

        // Protect and Default are not accessed outside of the package

    }
}
