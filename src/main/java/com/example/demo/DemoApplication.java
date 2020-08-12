package com.example.demo;


import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
@SpringBootApplication
@RestController
public class DemoApplication {

	
	@GetMapping("/")
	public String home()
	{
		
		return "Hello World";
	}
	
	@PostMapping("/webhook")
    public void getMyJson(@RequestBody Map<String, Object> json) {
    System.out.println("WebHook collected JSON: " + json);
    }


	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}

}
