package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface studentService {

	Student createStudent(Student student);
	
	Student updateStudent(Student student);
	
	void deleteStudent(Student student);
	
	Optional<Student> getStudent(long id);
	
	List<Student> getAllStudents();
	
	
}
