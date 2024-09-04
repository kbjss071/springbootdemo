package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController1 {
	
	@PostMapping("/post")
//	public String demoPost(@RequestBody String req, Model model) {
		public String demoPost(@RequestParam String membername,
							@RequestParam String memberid,
							@RequestParam String memberemail,
							Model model) {
		// if you want to use each parameter separately, use @requestParam instead of @RequestBody
		
		model.addAttribute("membername", membername);
		model.addAttribute("memberid", memberid);
		model.addAttribute("memberemail", memberemail);
		
		System.out.println("Success");
//		System.out.println(req);
		
		return "/post/post";
	}
}
