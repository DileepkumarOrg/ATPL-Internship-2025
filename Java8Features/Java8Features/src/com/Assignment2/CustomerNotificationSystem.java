package com.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CustomerNotificationSystem {
	String name;
	boolean isSubscribed;
	
	public CustomerNotificationSystem(String name, boolean isSubscribed) {
		this.name =name;
		this.isSubscribed = isSubscribed;
	}
	public static void main(String[] args) {
		List<CustomerNotificationSystem> subscriberList = new ArrayList<CustomerNotificationSystem>();
		subscriberList.add(new CustomerNotificationSystem("Dileep", true));
		subscriberList.add(new CustomerNotificationSystem("Sandeep", true));
		subscriberList.add(new CustomerNotificationSystem("Naveen", false));
		subscriberList.add(new CustomerNotificationSystem("Mahesh", false));
		System.out.println("Subscribers List : \n");
		Consumer<String> notify = (msg) -> System.out.println(msg);
		subscriberList.stream().filter((subscriber) -> subscriber.isSubscribed)
								.forEach((subscriber) -> {
									
									System.out.print(subscriber.name+"  ");
									notify.accept("You are Subscribed....!");
								});
	}

}


//Output :
//	Subscribers List : 
//	
//	Dileep  You are Subscribed....!
//	Sandeep  You are Subscribed....!
