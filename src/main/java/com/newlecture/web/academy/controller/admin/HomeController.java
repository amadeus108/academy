package com.newlecture.web.academy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminHomeController")
@RequestMapping("/sist/admin/")
public class HomeController {
	
	@GetMapping("index")
	public String index(Model model) {
		return "admin.index";
	}
}
