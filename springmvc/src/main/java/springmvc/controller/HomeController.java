package springmvc.controller;

import java.time.LocalDateTime;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(consumes="/home", method=RequestMethod.GET) 
	public String home(Model model) {
		
		model.addAttribute("name","nitin");
		model.addAttribute("id",12345);
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Anand");
		nameList.add("Vishal");
		nameList.add("Nitin");
		
		model.addAttribute("f",nameList);
		
		return "index";
		
	}
	

	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is about page.");
		return "/about";
	}
	
	@RequestMapping("/pagehome")
	public String Homepage() {
		return "Home";
		
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView mnd= new ModelAndView();
		mnd.addObject("name","Anand");
		LocalDateTime time = LocalDateTime.now();
		mnd.addObject("now", time);
		mnd.setViewName("help");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(30);
		list.add(40);
		list.add(50);
		
		mnd.addObject("marks", list);
		
		return mnd;
		
		
	} 


}
