package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstdemo.dto.userDTO;


@Controller
public class SampleController3 {
//	@PostMapping("/SampleController3")
//	public String userForm(String username, String userid, String userphone) {
//		
//		return "/post/SampleController3View";
//	}
	@PostMapping("/SampleController3")
	public String userForm(userDTO userDTO, Model model) {
		
		// print through userDT object
		System.out.println();
		
		return "/post/SampleController3View";
	}
}
