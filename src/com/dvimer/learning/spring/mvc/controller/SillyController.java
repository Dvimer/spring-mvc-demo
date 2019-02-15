package com.dvimer.learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funny")
public class SillyController
{
@RequestMapping("showform")
	public String displayTheForm(){
		return "silly";
	}
}
