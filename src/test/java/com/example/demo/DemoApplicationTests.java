package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	//we have this by default to make sure sppring wiring is happening correctly
	//its a simpe junit test
	/*
	@Test
	void contextLoads() {
	}
	*/
	@Autowired
	private StudentRepository studentRepository;
	
	
	//creating my own test
	@Test
	public void testCreateStudent()
	{
		Student student=new Student();
		student.setName("Laxmi");
		student.setCourse("Java Programming");
		student.setFee(30d);
		studentRepository.save(student);
	}
	

	
}
