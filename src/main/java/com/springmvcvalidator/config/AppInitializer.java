package com.springmvcvalidator.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass = {AppConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] urlMapping = {"/SpringMVCValidator.com/*"};
		return urlMapping;
	}

}
