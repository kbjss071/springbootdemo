package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstdemo.dto.BookDTO;

@Controller
public class SampleController5 {
	
	@GetMapping("/SampleController5Form")
	public String insertBook( Model model) {
	
		model.addAttribute("bookDTO", new BookDTO());
		
		return "/post/SampleController5Form";
	}
	
	@PostMapping("/SampleController5View")
	public String insertView(
			BookDTO bookDTO, Model model) {
		
		System.out.println(bookDTO.getTitle());
		System.out.println(bookDTO.getAuthor());
		System.out.println(bookDTO.getPublisher());
		System.out.println(bookDTO.getPublishdate());
		
		model.addAttribute("heading", "New registered book");
		
		
		return "/post/SampleController5View";
	}

}
