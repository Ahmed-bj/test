package com.project.GestionPersonne.exception;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // inside field
@Retention(RetentionPolicy.RUNTIME)
public @interface AgeValidation {
    String message() default "Age must be a number and not less than 150.";

    Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};
}
class AgeValidationInterface implements ConstraintValidator<AgeValidation, Integer> {

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        return  age < 150;
    }
}