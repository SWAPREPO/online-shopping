package com.sst.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index", "/login"})
	public ModelAndView index()
	{
		ModelAndView mv =  new ModelAndView("page");
<<<<<<< HEAD
<<<<<<< HEAD
		mv.addObject("greeting", "Welcome to spring MVC");
=======
		mv.addObject("greeting", "Welcome to my spring MVC");
>>>>>>> refs/remotes/origin/main
=======
		mv.addObject("greeting", "Welcome to swapnil my spring MVC");
>>>>>>> refs/remotes/origin/main
		return mv;
	}
	
}
