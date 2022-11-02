package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController{

	@Value("${servicename}")
	private String property;

	@GetMapping("/getcofig")
	public String getProperties() {
		System.out.println(property);
		return property;
	}
}
