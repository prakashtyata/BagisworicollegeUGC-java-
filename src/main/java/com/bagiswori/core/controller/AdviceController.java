package com.bagiswori.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AdviceController {

	@ExceptionHandler /* ({ NoHandlerFoundException.class, RuntimeException.class }) */
	public ModelAndView handle(Exception ex) {
		ModelAndView errorPage = new ModelAndView("errorPage");
		String errorMsg = "";
		int statusCode = 0;
		String className = ex.getClass().getSimpleName();
		if (className.equalsIgnoreCase("NoHandlerFoundException")) {
			statusCode = HttpStatus.NOT_FOUND.value();
		} else if (className.equalsIgnoreCase("RuntimeException")) {
			statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
		} else if (className.equalsIgnoreCase("DataNotFoundException")) {
			statusCode = 222;
		}
		switch (statusCode) {
		case 400: {
			errorMsg = "Http Error Code: 400. Bad Request";
			break;
		}
		case 401: {
			errorMsg = "Http Error Code: 401. Unauthorized";
			break;
		}
		case 404: {
			errorMsg = "Http Error Code: 404. Resource not found";
			break;
		}
		case 500: {
			errorMsg = "Http Error Code: 500. Internal Server Error";
			break;
		}
		case 222: {
			errorMsg = new StringBuilder().append(ex.getMessage()).toString();
			break;
		}
		case 0: {
			errorMsg = new StringBuilder().append(ex.getMessage()).toString();
			break;
		}
		}
		errorPage.addObject("errorMsg", errorMsg);
		return errorPage;
	}
}