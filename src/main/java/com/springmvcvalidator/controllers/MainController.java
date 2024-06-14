package com.springmvcvalidator.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcvalidator.api.CreditCard;
import com.springmvcvalidator.api.UserInfoDTO;
import com.springmvcvalidator.custom_editor.CreditCardEditor;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@RequestMapping("/test")
	public String testPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDto) {
		return "test";
	}
	
	@RequestMapping("/postPage")
	public String testPageV2(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDto, BindingResult res) {
		if (res.hasErrors()) {
			
			List<ObjectError> errors = res.getAllErrors();
			for (ObjectError errorItem : errors) {
				System.out.println("Error Item " + errorItem);
			}
			
			
			userInfoDto.setPassword(null);
			return "test";
		}
		
		return "post";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(CreditCard.class, new CreditCardEditor());
	}
}
