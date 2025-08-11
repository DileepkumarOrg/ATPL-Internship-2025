package package1;

public class InsidePackage {
    public static void main(String[] args) {
        PublicClass anotherClassInSamePackage = new PublicClass();
        anotherClassInSamePackage.publicClassMethod();
        anotherClassInSamePackage.protectedMethod();
        anotherClassInSamePackage.defaultMethod();
        //anotherClassInSamePackage.privateMethod();          Private Method is Not accessd 
    }
}
