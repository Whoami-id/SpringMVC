package com.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HalloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "halloworld-form";
	}

//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "halloworld";
//	}

	@RequestMapping("/processFromVersionTwo")
	public String letsSoutDude(HttpServletRequest req, Model model) {
		String name = req.getParameter("studentName");
		name = name.toUpperCase();

		String result = "Yo " + name;
		model.addAttribute("message", result);

		return "halloworld";
	}
	
	@RequestMapping("/processFromVersionThree")
	public String processFromVersionThree(@RequestParam("studentName")String name, Model model) {
		name = name.toUpperCase();

		String result = "Yo " + name;
		model.addAttribute("message", result);

		return "halloworld";
	}

}
