package com.ragukar.cenlinsbj1.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {
	@Value("${WEBSITE_HOSTNAME:raguapp}")
	private String sitename;
	@Value("${HOSTNAME:winbox}")
	private String machineName;
	
	@GetMapping("/test")
	public String test() {
		return "Hello there!";
	}
	
	@GetMapping("/")
	public String hello() {
		return String.format("Hello from %s running on instance %s", this.sitename,this.machineName);
	}
}
