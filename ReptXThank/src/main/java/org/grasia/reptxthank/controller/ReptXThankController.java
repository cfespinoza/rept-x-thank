package org.grasia.reptxthank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReptXThankController {
	
	@RequestMapping("/welcome")
	public String sayHello(ModelMap model){
		model.addAttribute("message", "ReptXThank users");
		return "welcome";
	}
	
}