package org.example.SRP;

import java.util.regex.Pattern;

public class Validation {

    public boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
