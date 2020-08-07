package com.junkdrawer.multitool.quote;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuoteController {
	
	@GetMapping("/quote")
	public String quote(){
		return "Quote: ";
	}
}