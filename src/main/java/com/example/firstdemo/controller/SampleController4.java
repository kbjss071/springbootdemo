package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstdemo.dto.userDTO;

// Data access layer through templates folder

@Controller
public class SampleController4 {
	
	@GetMapping ("/SampleController4Form")
	public String mainPage() {
		
		return "/post/SampleController4Form";
	}
	
	@PostMapping("/Samplecontroller4View")
	public String userForm(userDTO userDTO, Model model) {
		
		// print through user DTO
		System.out.println(userDTO.getUserName());
		System.out.println(userDTO.getUserId());
		System.out.println(userDTO.getUserPhone());
		
		// add data to model attribute
		model.addAttribute("heading", "User Information");
		
		return "post/SampleController4View";
	}
}
