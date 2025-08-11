package package1;

public class PublicClass {
    public void publicClassMethod(){
        System.out.println("Public Method accessd..");
    }
    private void privateMethod(){
        System.out.println("Private Method is accessed..");
    }
    void defaultMethod(){
        System.out.println("Default Method is accessed..");
    }
    protected void protectedMethod(){
        System.out.println("Protected Method is acessed..");
    }


    public static void main(String[] args) {
        PublicClass withinClassObj = new PublicClass();
        withinClassObj.publicClassMethod();
        withinClassObj.defaultMethod();
        withinClassObj.protectedMethod();
        withinClassObj.privateMethod();
    }
}
