package com.example.registeration.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = EmailMatcherValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EmailMatch {
    String message() default "Email do not match";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
