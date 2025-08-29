package com.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UserSearchEmailTransformation {

    String name;
    String email;

    public UserSearchEmailTransformation(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) {
        List<UserSearchEmailTransformation> userData = new ArrayList<>();
        userData.add(new UserSearchEmailTransformation("Dileep", "dileep@gmail.com"));
        userData.add(new UserSearchEmailTransformation("Sandeep", null));
        userData.add(new UserSearchEmailTransformation("Naveen", "naveen@gmail.com"));
        userData.add(new UserSearchEmailTransformation("Mahesh", "mahesh@gmail.com"));

        String userToFind = "Dileep";

        Function<String, String> toUpper = String::toUpperCase;

        Optional<String> emailOptional = userData.stream()
            .filter(user -> user.name.equalsIgnoreCase(userToFind))
            .map(user -> Optional.ofNullable(user.email)) 
            .findFirst() 
            .orElse(Optional.empty()); 

        emailOptional.map(toUpper)
                     .ifPresent(email -> System.out.println("Transformed Email :  " + email));
    }
}

