package com.dvimer.learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
	@RequestMapping("/showform")
	public String showForm()
	{
		return "helloworld-form";
	}

	@RequestMapping("/processform")
	public String processForm()
	{
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model)
	{
		String studentName = request.getParameter("studentName");
		studentName = studentName.toUpperCase();
		String result = "You " + studentName;
		model.addAttribute("message", result);
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTree")
	public String processFormVersionTree(@RequestParam("studentName") String studentName, Model model)
	{
		studentName = studentName.toUpperCase();
		String result = "You " + studentName;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
