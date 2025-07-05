package Oops.OverloadedConstructor;

public class User {

    String username;
    String email;
    int age;

    // Default constructor
    User() {
        this.username = "guest";
        this.email = "not provided";
        this.age = 0;
    }

    // Constructor with username
    User(String username) {
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }

    // Constructor with username and email
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    // Constructor with username, email, and age
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

