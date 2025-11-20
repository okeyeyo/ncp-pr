package com.lgdx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring Boot에서는 FC가 Controller를 찾기위한 작업이 자동으로 진행
// SpringBoot1Application.java에서 

@Controller
public class MyViewController {
	// 화면을 띄어주시만 하는 컨트롤러
	
	@GetMapping("/")
	public String goHome() {
		return "Main";
	}
	
	@GetMapping("/goUpdate") 
	public String goUpdate() {
		return "UpdateMember";
	}
}
