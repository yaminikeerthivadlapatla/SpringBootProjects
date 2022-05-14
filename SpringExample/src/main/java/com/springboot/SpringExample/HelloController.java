package com.springboot.SpringExample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/*@RequestMapping("/hello1")
	public String hello1() {
		return "My Spring Example";
	}
	@RequestMapping("Yamini")
	public String Yamini() {
		return "Hello Yamini";
	}*/
	/*@PostMapping("/postmap")
	public String postmap() {
		return "My Postmap Example";
	}*/
	@PostMapping("/user")
	public String PostMethod(String str) {
		return "Welcome Yamini"+str;
	}
}