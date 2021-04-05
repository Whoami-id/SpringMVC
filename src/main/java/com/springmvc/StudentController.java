package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);

		return "student-form";
	}

//	@RequestMapping("/processForm")
//	public String processForm(@ModelAttribute("student") Student s) {
//		System.out.println(s.getFirstName() + " " + s.getLastName());
//		return "student-confirmation";
//	}

}
