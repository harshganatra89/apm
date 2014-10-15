package com.self.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(
			@RequestParam(value = "name", required = false, defaultValue = "Page") String name,
			Model model) {
		model.addAttribute("name", name);
		return "home";
	}

}
