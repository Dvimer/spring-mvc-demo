package com.dvimer.learning.spring.mvc.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/customer")
public class CustomerController
{
	@InitBinder
	public void init(WebDataBinder dataBinder)
	{
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping(value = "/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping(value = "/processForm")
	public String processForm(
		 @Valid @ModelAttribute("customer") Customer customer,
		BindingResult result)
	{
		if (result.hasErrors())
		{
			return "customer-form";
		}
		else
			return "customer-confirmation";
	}
}
