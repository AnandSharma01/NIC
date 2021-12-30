package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class MyController {
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("name","Anand");
		
	}

	@RequestMapping("/home")
	public String showForm() {
		
		return "Home";
	}
	
  @RequestMapping(value ="/processfrom", method=RequestMethod.POST)
//  public String handleForm(HttpServletRequest request) {
//	String email = request.getParameter("email");
//	System.out.println(email);
//	
//	return "";
//	}
//  public String handleForm(@RequestParam("email") String email,@RequestParam("fname") String fname, @RequestParam("lname") String lname,@RequestParam("password") String password) 
//  {
//	  
//	  System.out.println(fname);
//	  System.out.println(lname);
//	  System.out.println(email);
//	  System.out.println(password);
//
//		
//		return "";
//		}
  //hhiy
  public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		
		
		return "help";
		}
}      
