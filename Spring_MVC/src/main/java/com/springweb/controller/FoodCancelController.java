package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodCancelController {
	
	@RequestMapping("/cancelOrder")
	public ModelAndView foodCancel()
	{
		System.out.println("foodCancel() method called.");
		ModelAndView view = new ModelAndView();
		view.setViewName("CancelOrderService");
		return view;
	}
}
