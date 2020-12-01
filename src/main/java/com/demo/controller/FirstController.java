package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping("")
	public String hello()
	{
		return "<h1>welcome to the spring boot framework</h1><br><a href='hello'> découvrez spring boot</a>";
	}
	@RequestMapping("hello")
	public String message()
	{
		return "spring boot is the best spring version for API<br> <a href='more'>Read more</a>";
	}
	@GetMapping("more")
	public ModelAndView page()
	{
		
		
	}
	
	
}
