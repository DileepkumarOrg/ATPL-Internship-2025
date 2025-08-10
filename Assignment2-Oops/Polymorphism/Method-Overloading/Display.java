public class Display {
    public void show(int num){
        System.out.println("integer is "+num);
    }
    public void show(String str){
        System.out.println("String is "+str);
    }
    public void show(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Display intObj = new Display();
        intObj.show(47);
        Display strObj = new Display();
        strObj.show("Dileep");
        Display arrayObj = new Display();
        int[] arr = {5,4,6,8,9};
        arrayObj.show(arr);
    }
}
