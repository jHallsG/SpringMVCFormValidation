package com.springmvcvalidator.custom_editor;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

import com.springmvcvalidator.api.CreditCard;


public class CreditCardEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			CreditCard cCard = new CreditCard();
			
			if (text.length() != 16) {
				cCard.setIndustryIdentifier("");
				cCard.setIssuerIdentifier("");
				cCard.setUserNumber1("");
				cCard.setUserNumber2("");
			} else {
				cCard.setIndustryIdentifier(text.substring(0, 4));
				cCard.setIssuerIdentifier(text.substring(4, 8));
				cCard.setUserNumber1(text.substring(8, 12));
				cCard.setUserNumber2(text.substring(12));
			}
			
			System.out.println(cCard.toString());
			setValue(cCard);
			
		} catch(Exception e) {
			 throw new IllegalArgumentException("Invalid credit card number format");
		}
	}

	@Override
	public String getAsText() {
		// whatever values we return here will overwrite the values we set in the Controller. To display the same values we got from the controller,
		// use the getValue() method
		CreditCard cCard = (CreditCard) getValue();
		if (cCard == null) {
			return "";
		}
		return cCard.toString();
	}
	
	
}
