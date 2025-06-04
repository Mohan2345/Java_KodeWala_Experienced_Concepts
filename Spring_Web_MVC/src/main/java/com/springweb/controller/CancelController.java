package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CancelController {

	@RequestMapping("/cancelService")
	public ModelAndView cancelCab()
	{
		System.out.println("CancelController.cancelCab()");
		ModelAndView view = new ModelAndView();
		view.setViewName("cancelBookingService");
		return view;
	}
}
