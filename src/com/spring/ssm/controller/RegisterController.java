package com.spring.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	/*@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
	}*/

	@RequestMapping(value="/register")
	public void register(String name, Date date) {
		System.out.println("RegisterController.register()");
		System.out.println(name);
		System.out.println(date);
	}
}
