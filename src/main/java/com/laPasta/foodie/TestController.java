package com.laPasta.foodie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class TestController {
	
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home page");
		return "home";
	}
	
	@RequestMapping("/auth")
	public String auth() {
		System.out.println("auth page");
		return "auth";
	}

}
