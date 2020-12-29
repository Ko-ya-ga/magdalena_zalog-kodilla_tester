package com.kodilla;

public class UserValidator {
    public boolean validateUser(User user) {
        boolean result = false;
        if (user.getName() != null) {
            if (user.getAge() > 30 && user.getHeight() > 160) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
