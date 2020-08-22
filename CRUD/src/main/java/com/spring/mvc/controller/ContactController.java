package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.mvc.bean.User;

@Controller
public class ContactController {

	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	
	
	/*
	 * @RequestMapping(path="/processform", method=RequestMethod.POST) public String
	 * successAdmin(@RequestParam("username") String
	 * uname, @RequestParam("password") String pwd,Model m) {
	 * System.out.println(uname+":"+pwd);
	 * 
	 * // m.addAttribute("name",uname);
	 * 
	 * User user = new User(uname,pwd); m.addAttribute("user",user);
	 * 
	 * 
	 * to fetch data -> old method : same as servlet Httpservletrequest return
	 * "success"; }
	 */
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String successAdmin(@ModelAttribute User user,Model model) {
		
		
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
			return "redirect:/viewData";
			}
		
		return null;
	}
	
	
}
