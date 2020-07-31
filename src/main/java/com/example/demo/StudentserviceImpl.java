package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentserviceImpl implements studentService 
{

	
	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student createStudent(Student student) {
		return getRepository().save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return getRepository().save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		getRepository().delete(student);
	}

	@Override
	public Optional<Student> getStudent(long id) {
	
		Optional<Student> student=repository.findById(id);
		//System.out.println(student.getName());
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	public StudentRepository getRepository() {
		return repository;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

	

	 
}

	


