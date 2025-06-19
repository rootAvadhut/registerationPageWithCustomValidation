package com.example.registeration.validation;

import com.example.registeration.model.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class PasswordMatcherValidator implements ConstraintValidator<PasswordMatch, User> {
    private static final List<String> WEAK_PASSWORDS =List.of(
            "12345","password","qwert","pass123"
    );
    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        if(user==null) return false;
        String password=user.getPassword();
        String confirmPassword=user.getConfirmPassword();
        return password != null &&
                password.equals(confirmPassword) &&
                password.length()>5 &&
                !WEAK_PASSWORDS.contains(password.toLowerCase());
    }
}
