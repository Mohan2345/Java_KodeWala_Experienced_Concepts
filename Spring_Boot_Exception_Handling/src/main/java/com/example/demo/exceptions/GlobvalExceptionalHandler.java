package com.example.demo.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobvalExceptionalHandler 
{
	@ExceptionHandler(AadharUserClassExceptions.class)
	public String AadharUserClassExceptions(AadharUserClassExceptions ac
																									, Model model)
	{
		model.addAttribute("message", ac.getMessage());
		return "error";
	}
	@ExceptionHandler(Exception.class)
	public String handleGenericException(Exception ex, Model model)
	{
		model.addAttribute("message", ex.getMessage());
		return "error";
	}
}
