import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StartsWith {
	public static void main(String[] args) {
	List<String> namesList=new ArrayList<>();
	List<String> sortedList=new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of names you want to enter:");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the name :"+i);
		namesList.add(sc.next());
	}
	System.out.println("entered names:"+namesList);
	System.out.println("enter the first word ,based on names will come:");
	char ch=sc.next().charAt(0);
   namesList.forEach(name->{
	   if(name.startsWith(ch)) {
		   sortedList.add(name);
	   }
   });
   System.out.println("the FInal names you want : "+sortedList);
}
}