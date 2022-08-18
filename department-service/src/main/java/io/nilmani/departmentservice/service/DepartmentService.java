package io.nilmani.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import io.nilmani.departmentservice.entity.Department;
import io.nilmani.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository depRepository;
	
	public Department saveDepartment(@ModelAttribute Department department) {
		log.info("Department details save through department controller");
//	
		
		return depRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
		return depRepository.findByDepartmentId(departmentId);
	}

}
