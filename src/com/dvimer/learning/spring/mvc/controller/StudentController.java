package com.dvimer.learning.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("countryOptions", countryOptions);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String showForm(@ModelAttribute("student") Student student)
	{
		System.out.println(student);
		return "student-confirmation";
	}
}
