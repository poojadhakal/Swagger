package com.springSwagger2.Service;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springSwagger2.Dao.EmploymentDao;
import com.springSwagger2.Model.Employment;

@Service
public class EmploymentService {
	@Autowired
EmploymentDao connection;	
	
	public Employment saveEmployment(Employment emp) {
		Employment empl = connection.save(emp);
		return empl;
			}
	public List<Employment> saveEmployments(List<Employment> employment) {
		List<Employment> emp=(List<Employment>) connection.saveAll(employment);
		return emp;

			}
	
    
}
