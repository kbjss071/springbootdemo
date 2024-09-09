package com.example.firstdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.firstdemo.dto.BoardDTO;

// Repeatedly print data objects through thymeleaf
// Create multiple data objects and transfer those into view page by using thymeleaf loop

@Controller
public class SampleController6 {

	@GetMapping("/SampleController6")
	public String mainPage(Model model) {
		
		// Create a single object
		BoardDTO boardDTO = new BoardDTO(1, "btitle", "bname");
		
		// Create multiple objects
		BoardDTO b1 = new BoardDTO(1, "btitle1", "bname1");
		BoardDTO b2 = new BoardDTO(2, "btitle2", "bname2");
		BoardDTO b3 = new BoardDTO(3, "btitle3", "bname3");
		BoardDTO b4 = new BoardDTO(4, "btitle4", "bname4");
		BoardDTO b5 = new BoardDTO(5, "btitle5", "bname5");
		
		List<BoardDTO> bList = new ArrayList<>();
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);
		bList.add(b5);
		
		//model
		model.addAttribute("boardDTO", boardDTO);
		model.addAttribute("bList", bList);
		
		return "/post/SampleController6";
	}
	
	
}
