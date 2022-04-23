package com.jforce.tr.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.tr.modal.Student;
import com.jforce.tr.repository.StudentRepository;



@Service
//@Transactional(rollbackOn = Exception.class)
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	

	@Override
	public List<Student> getList() {
		
		/*Student a= new Student();
		a.setId(8);
		a.setFirstName("scbdn");
		a.setLastName("hafg");
		studentRepository.save(a);
		if (1==1) {
				throw new RuntimeException();
		}
		*/return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
		
	}


	@Override
	public void updateStudent(Integer id, String name) {
		Student tempstudent = studentRepository.findById(id).get();
		tempstudent.setFirstName(name);
		studentRepository.save(tempstudent);
	}
	
	
}
