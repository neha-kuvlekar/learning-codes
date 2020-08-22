package com.spring.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.bean.User;
import com.spring.mvc.bean.worker;
import com.spring.mvc.dao.workerdao;

@Controller
public class WorkerController {

	@Autowired
	private workerdao dao;
	
	@RequestMapping("/")
	public String showForm() {
		return "adminLogin";
	}

	@RequestMapping(path="/entryform", method=RequestMethod.POST)
	public String successAdmin(@ModelAttribute User user,Model model) {
		
		
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
			return "redirect:/viewData";
			}
		else
		return "adminLogin";
	}
	@RequestMapping("/viewData")
	public String showForm(@ModelAttribute worker worker,Model model) {
		
		List<worker> list = dao.getEmployees();
		System.out.println(list);
		model.addAttribute("list",list);
		return "view";
	}

	@RequestMapping("/addproduct")
	public String addWorker(Model m) {
		m.addAttribute("title","Add Worker");
		return "add_worker";
	}
	
	@RequestMapping(value="/handle-product",method=RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute("worker") worker wobj,HttpServletRequest request) {
		RedirectView view = new RedirectView();
		System.out.println(wobj.toString());
		dao.insert(wobj);
		view.setUrl(request.getContextPath()+"/viewData");
		return view;
	}
	
	@RequestMapping("/editproduct/{TaskId}")
	public String editWorker(@PathVariable("TaskId")int TaskId,Model m) {
		worker obj = dao.getworker(TaskId);
	
		m.addAttribute("title","Edit Worker");
		m.addAttribute("obj",obj);

		return "edit_worker";
	}
	
	@RequestMapping(value="/edit-product",method=RequestMethod.POST)
	public RedirectView editproduct(@ModelAttribute("worker") worker wobj,HttpServletRequest request) {
		RedirectView view = new RedirectView();
		System.out.println(wobj.toString());
		dao.insert(wobj);
		view.setUrl(request.getContextPath()+"/viewData");
		return view;
	}
	
	@RequestMapping(value="/deleteproduct/{TaskId}",method=RequestMethod.GET)
	public RedirectView deleteproduct(@PathVariable("TaskId") int id,@ModelAttribute("worker") worker wobj,HttpServletRequest request) {
		RedirectView view = new RedirectView();
		System.out.println(wobj.toString());
		dao.deleteworker(id);
		view.setUrl(request.getContextPath()+"/viewData");
		return view;
	}
}
