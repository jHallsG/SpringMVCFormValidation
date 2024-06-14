package com.springmvcvalidator.custom_validator;

import com.springmvcvalidator.api.CreditCard;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CreditCardValidator implements ConstraintValidator<CreditCardPattern, CreditCard>{
	
	private static final String CREDIT_CARD_PATTERN = "^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$";

	@Override
	public boolean isValid(CreditCard value, ConstraintValidatorContext context) {
		 if (value == null) {
	            return false;
	     }
		
//		 String creditCardNumber = value.toString();
		 String creditCardNumber = value.getIndustryIdentifier() + "-" + value.getIssuerIdentifier() + "-" 
				 + value.getUserNumber1() + "-" + value.getUserNumber2();
		 
		 return creditCardNumber.matches(CREDIT_CARD_PATTERN);
	}
}
