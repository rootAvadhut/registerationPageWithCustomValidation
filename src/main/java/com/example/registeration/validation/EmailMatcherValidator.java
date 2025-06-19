package com.example.registeration.validation;

import com.example.registeration.model.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class EmailMatcherValidator implements ConstraintValidator<EmailMatch, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        if (user==null) return false;
        String email=user.getEmail();
        String confirmEmail=user.getConfirmEmail();
        return email !=null && email.equals(confirmEmail);
    }
}
