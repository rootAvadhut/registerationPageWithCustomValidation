package com.example.registeration.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatcherValidator.class)
@Target({ElementType.TYPE})
public @interface PasswordMatch {
    String message() default "password is do not match";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
