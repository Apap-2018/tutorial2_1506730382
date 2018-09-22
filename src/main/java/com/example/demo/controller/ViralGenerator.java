package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
@Controller
public class ViralGenerator {
	
	@RequestMapping("/generator")
	public String viralGenerator(@RequestParam(value = "a", required = false, defaultValue = "0") String a,
								 @RequestParam(value = "b", required = false, defaultValue = "0") String b,
								 Model model) {
		int val1 = Integer.parseInt(a);
		int val2 = Integer.parseInt(b);
		
		if (val1 == 0) {
			val1 = 1;
		}
		if (val2 == 0) {
			val2 = 1;
		}
		
		model.addAttribute("valueA", val1);
		model.addAttribute("valueB", val2);
		
		String hmmms = "";
		
		for (int i = val2; i == 0; i--) {
			hmmms = hmmms + "h";
			for (int j = val1; j == 0; j--) {
				hmmms = hmmms + "m";
			}
			hmmms = hmmms + " ";
		}
		
		model.addAttribute("hems", hmmms);
		return "viralgen";
	}
	
}
*/
