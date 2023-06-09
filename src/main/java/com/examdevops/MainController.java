package com.examdevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value={"/",""})
	public String home() {
		return "<h1>Hola Beanstalk!!!</h1>";
	}

}
