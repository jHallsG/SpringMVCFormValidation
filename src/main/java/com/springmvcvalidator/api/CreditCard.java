package com.springmvcvalidator.api;

public class CreditCard {
	
	private String industryIdentifier;
	private String issuerIdentifier;
	private String userNumber1;
	private String userNumber2;
	
	public String getIndustryIdentifier() {
		return industryIdentifier;
	}
	public String getIssuerIdentifier() {
		return issuerIdentifier;
	}
	public String getUserNumber1() {
		return userNumber1;
	}
	public String getUserNumber2() {
		return userNumber2;
	}
	public void setIndustryIdentifier(String industryIdentifier) {
		this.industryIdentifier = industryIdentifier;
	}
	public void setIssuerIdentifier(String issuerIdentifier) {
		this.issuerIdentifier = issuerIdentifier;
	}
	public void setUserNumber1(String userNumber1) {
		this.userNumber1 = userNumber1;
	}
	public void setUserNumber2(String userNumber2) {
		this.userNumber2 = userNumber2;
	}
	
	@Override
	public String toString() {
		return industryIdentifier + "-" + issuerIdentifier + "-" + userNumber1 + "-" + userNumber2;
	}

	
}
