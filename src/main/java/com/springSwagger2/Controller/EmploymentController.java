package com.springSwagger2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springSwagger2.Model.Employment;
import com.springSwagger2.Service.EmploymentService;
@RestController
@RequestMapping("/api/employment")
public class EmploymentController {
	@Autowired
	EmploymentService service;
	@PostMapping("/save")
public Employment saveEmployment(@RequestBody Employment e) {
		Employment em=service.saveEmployment(e);
		return em;
	}
	@PostMapping("/add")
	public List<Employment> addEmployent(@RequestBody List<Employment> employment) {
			List<Employment> Employmentlist=service.saveEmployments(employment);
			return Employmentlist;
		}

	
	
		
}
