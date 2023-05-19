package com.example.EnvironmentVariables1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	@Autowired
	public Environment environment;
	
	@GetMapping
	public String getController() {
		return "Hi! authCode:" + environment.getProperty("authCode") + " dev:" + environment.getProperty("devName");
	}
}
