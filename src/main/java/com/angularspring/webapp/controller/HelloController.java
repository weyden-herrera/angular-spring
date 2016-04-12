package com.angularspring.webapp.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ComponentScan
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello (Model model){
		model.addAttribute("name", "weyden");
		return "indexpage";
	}
	
	@RequestMapping(value = "/hey", method = RequestMethod.GET)
	public String hey (Model model){
		return "indexpage";
	}
	
}
