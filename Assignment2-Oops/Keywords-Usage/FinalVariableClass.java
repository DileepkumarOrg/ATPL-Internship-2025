public  class FinalVariableClass {
    final String name = "Dileep";
    //String name = "Sandeep";
}

class InnerFinalVariableClass extends FinalVariableClass {
    public static void main(String[] args) {
        InnerFinalVariableClass obj = new InnerFinalVariableClass();
        System.out.println(obj.name);
    }
    
}

