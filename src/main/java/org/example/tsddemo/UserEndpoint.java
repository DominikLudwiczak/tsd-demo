package org.example.tsddemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//TODO - Task 3.1 - Use annotation to indicate this is a REST Controller
@RestController
@RequestMapping("/user")
public class UserEndpoint {

    private final List<User> users = new ArrayList<>();

    //TODO - Task 3.2 - This method should be mapped to HTTP POST with request body
    //TODO - Task 3.3 - An new User should be added to the users list
    //TODO - Task 3.3 - Response should be OK (200) with user ID in JSON format: { "id": 1234 }
    @PostMapping
    ResponseEntity<?> createUser(@RequestBody User user) {
        users.add(user);
        long id = users.size(); // Simulate ID generation
        return ResponseEntity.ok().body(new UserResponse(id));
    }

    private static class UserResponse {
        public long id;

        public UserResponse(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }
    }
}
