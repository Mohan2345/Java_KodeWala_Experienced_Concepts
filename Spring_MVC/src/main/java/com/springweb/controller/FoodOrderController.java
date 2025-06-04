package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodOrderController {

	@RequestMapping("/orderFood")
	public ModelAndView foodOrder()
	{
		System.out.println("orderFood() method called");
		ModelAndView view = new ModelAndView();
		view.setViewName("FoodOrderService");
		return view;
	}
}
