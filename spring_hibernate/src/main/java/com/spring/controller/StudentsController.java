package com.spring.controller;



	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.spring.service.Studentsservice;
	import com.spring.service.StudentsserviceImpl;

	@Controller
	@RequestMapping("/")
	public class StudentsController
	{
		@Autowired
		private Studentsservice StudentsService;
		
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String liststudents(Model model) {
			model.addAttribute("Students", StudentsService.listStudents());
			return "Students";
		}
	
	
}
