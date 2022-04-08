package com.jforce.tr.service;

import java.util.List;

import com.jforce.tr.modal.Student;

public interface StudentService {
	List<Student> getList();

	Student getStudentById(Integer id);

	void deleteStudentById(Integer id);

	void addStudent(Student student);
	
	void updateStudent(Student student);
	
	void updateStudent (Integer id, String name);

}
