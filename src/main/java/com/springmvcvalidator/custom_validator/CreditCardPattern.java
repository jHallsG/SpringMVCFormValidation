package com.springmvcvalidator.custom_validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CreditCardValidator.class)
public @interface CreditCardPattern {
	
	String message() default "Invalid credit card number";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };

}
