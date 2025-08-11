package PackageB;
import PackageA.*;
import package1.PublicClass;

public class ClassB {
    public static void main(String[] args) {
        PublicClass publicClassObj = new PublicClass();
        //publicClassObj.defaultMethod();
        //publicClassObj.protectedMethod();

        // Protect and Default are not accessed outside of the package

    }
}
