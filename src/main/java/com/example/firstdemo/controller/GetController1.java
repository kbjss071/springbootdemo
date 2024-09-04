package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetController1 {
	
	@GetMapping("/user/userinfo")
	public String userInfo() {
		
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userdata")
	public String userData(Model model) {
		
		model.addAttribute("username", "user1");
		// Transfer model data to view
		
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userid")
	public String userId(@RequestParam(value = "userid", required=false) String userid, Model model) {
		
		model.addAttribute("userid", userid);	
		
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userparams")
	public String userParams(
			@RequestParam(value = "username", required=false) String username,
			@RequestParam(value = "userid", required=false) String userid,
			@RequestParam(value = "useremail", required=false) String uemail,
			@RequestParam(value = "usernumber", required=false) String usernumber,
			Model model) {
		
		model.addAttribute("username", username);
		model.addAttribute("userid", userid);
		model.addAttribute("useremail", uemail);
		model.addAttribute("usernumber", usernumber);
		
		return "/user/userinfo";
	}
}
