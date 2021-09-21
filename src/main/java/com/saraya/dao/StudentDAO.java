package com.saraya.dao;


import com.saraya.model.Student;

public interface StudentDAO {
	public void insert(Student student);
	public int remove(String prenom_nom); 

}
