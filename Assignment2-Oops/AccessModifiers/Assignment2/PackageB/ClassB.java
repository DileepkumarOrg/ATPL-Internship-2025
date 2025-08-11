package PackageB;
import PackageA.*;

public class ClassB {
    public static void main(String[] args) {
        ClassB publicClassObj = new ClassB();
        publicClassObj.defaultMethod();
        //publicClassObj.protectedMethod();

        // Protect and Default are not accessed outside of the package

    }
}
