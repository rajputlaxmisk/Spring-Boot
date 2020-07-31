package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/Student/")
public class StudentController
{
	@Autowired
	private StudentserviceImpl studentService;
    	
	@RequestMapping(value="/Students/{id}", method=RequestMethod.GET)
	public @ResponseBody Optional<Student> getStudent(@PathVariable(value="id") long id)
	throws Exception
	{
		Optional<Student> student=this.studentService.getStudent(id);
		return student;
	}
	
	@RequestMapping(value="/Students", method=RequestMethod.GET)
	public @ResponseBody List<Student> getAllStudent()
	throws Exception
	{
		return this.studentService.getAllStudents();
	}

	@RequestMapping(value="/Students", method=RequestMethod.POST)
	public @ResponseBody Student createStudent(@RequestBody Student student)
	throws Exception
	{
		return this.studentService.createStudent(student);
	}
	
	@RequestMapping(value="/Students", method=RequestMethod.DELETE)
	public @ResponseBody Student deleteStudent(@RequestBody Student student)
	throws Exception
	{
		this.studentService.deleteStudent(student);
		return student;
	}
	@RequestMapping(value="/Students", method=RequestMethod.PUT)
	public @ResponseBody Student updateStudent(@RequestBody Student student)
	throws Exception
	{
		this.studentService.updateStudent(student);
		return student;
	}

}
