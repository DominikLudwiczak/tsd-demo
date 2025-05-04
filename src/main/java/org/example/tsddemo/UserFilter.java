package org.example.tsddemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class UserFilter {

    //TODO - Task 2 - Finish the below method
    Collection<User> filter(Collection<User> users) {
        return users.stream()
                .filter(user -> !user.getName().startsWith("A")) // exclude names starting with 'A'
                .filter(user -> isValidEmail(user.getEmail()))   // exclude invalid emails
                .filter(user -> user.getPhone().startsWith("+48")) // keep only Polish phone numbers
                .collect(Collectors.toList());
    }

    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}
