package com.springmvcvalidator.api;

import com.springmvcvalidator.custom_validator.CreditCardPattern;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserInfoDTO {
	@NotBlank(message="*Name cannot be blank")
	private String firstName, lastName;
	@NotBlank(message="*Email cannot be blank")
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "*Not a valid email address")
	private String email;
	@NotEmpty(message="*Password cannot be blank")
	private char[] password;
	@NotNull(message = "*Please provide a valid credit card")
	@CreditCardPattern(message = "*Not a valid 16-digit credit card number.")
	private CreditCard creditCard;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	

}
