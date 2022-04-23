package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.modal.Student;
import com.jforce.tr.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
		
	@RequestMapping(path = "/getStudentList", method = RequestMethod.GET)
	public List<Student> getListStudents() {
		return studentService.getList();
	}
	@RequestMapping(path = "/getStudentById/{id}",method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") Integer id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(path = "/deleteStudentById/{id}",method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") Integer id) {
		 studentService.deleteStudentById(id);
		 return "Öğrenci Silinmiştir...";
	}

	@RequestMapping(path = "/add",method = RequestMethod.POST)
	public String addStudent(@RequestBody Student student) {
		 studentService.addStudent(student);
		 return "Öğrenci Eklenmiştir...";
	}
	
	@RequestMapping(path = "/update",method = RequestMethod.PUT)
	public String updateStudent(@RequestBody Student student) {
		 studentService.updateStudent(student);
		 return "Öğrenci Güncellenmiştir...";
	}
	
	
		@RequestMapping(path = "/update/{id}/{name}",method = RequestMethod.GET)
		public String idfornameStudent(@PathVariable ("id") Integer id,@PathVariable ("name") String name) {
			studentService.updateStudent(id, name);
			return " Öğrencinin first_name bilgisi gelen name ile değiştirilmiştir...";
		}
	
	
}

