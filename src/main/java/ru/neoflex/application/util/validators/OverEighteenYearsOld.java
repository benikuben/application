package ru.neoflex.application.util.validators;

import jakarta.validation.Constraint;
import jakarta.validation.constraints.Past;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OverEighteenYearsOldValidator.class)
@Past
public @interface OverEighteenYearsOld {
    String message() default "возраст должен быть больше 18 лет";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};
}
