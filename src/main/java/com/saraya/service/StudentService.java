package com.saraya.service;


import com.saraya.dto.StudentDTO;

public interface StudentService {
	public void insert(StudentDTO student);
	public int remove(String prenom_nom);
}
