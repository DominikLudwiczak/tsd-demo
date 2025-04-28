package org.example.tsddemo;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

//TODO - Task 3.1 - Use annotation to indicate this is a REST Controller
public class UserEndpoint {

    private final List<User> users = new ArrayList<>();

    //TODO - Task 3.2 - This method should be mapped to HTTP POST with request body
    //TODO - Task 3.3 - An new User should be added to the users list
    //TODO - Task 3.3 - Response should be OK (200) with user ID in JSON format: { "id": 1234 }
    ResponseEntity<?> createUser(User users) {
        return ResponseEntity.ofNullable(null);
    }
}
