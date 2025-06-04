package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
	
	@RequestMapping("/bookingService")
	public ModelAndView bookCab()
	{
		System.out.println("BookingController.bookCab()");
		ModelAndView view = new ModelAndView();
		view.setViewName("bookingConfirmation");
		return view;
	}
}
