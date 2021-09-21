package com.saraya.service;

import com.saraya.dao.StudentDAO;
import com.saraya.dao.StudentDAOImpl;
import com.saraya.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	StudentDAO std = new StudentDAOImpl();
	
	public void insert(StudentDTO student) {
		// TODO Auto-generated method stub
		std.insert(StudentDTO.prepareStudentEntity(student));
	}

	public int remove(String prenom_nom) {
		// TODO Auto-generated method stub
		return std.remove(prenom_nom);
	}

}
