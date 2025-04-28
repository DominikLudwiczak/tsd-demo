package org.example.tsddemo;

public class User {
    private final String name;
    private final String password;
    //TODO - Task 1.2 - Change email field type so it can handle users without email address
    private final String email;
    private final String phone;

    //TODO - Task 1.2 - You need to modify constructor to handle Users without emails
    public User(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    //TODO - Task 1.1 - Finish factory method
    static User of(String name, String password, String email, String phone) {
        return null;
    }

    //TODO - Task 1.3 - Finish another factory method, so it is possible to create User without email
    static User of(String name, String password, String phone) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    //TODO - Task 1.2 - Modify getter, so it returns company email if user has no email address
    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
