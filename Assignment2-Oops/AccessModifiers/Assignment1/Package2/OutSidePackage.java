package Package2;
import package1.*;

public class OutSidePackage {
    public static void main(String[] args) {
        PublicClass anotherPackageObj = new PublicClass();
        anotherPackageObj.publicClassMethod();
        // anotherPackageObj.defaultMethod();
        //withinClassObj.protectedMethod();
        //withinClassObj.privateMethod(); 

    }
}
