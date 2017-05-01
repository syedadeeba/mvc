package com.niit.controllers;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
//<bean id="helloController" class="com.niit.controllers.HelloController"></bean>
public class HelloController {
	//http://localhost:8030/mvc/hello
	@RequestMapping("/")
public String helloPage(){
	return "helloPage";
	//WEB-INF/pages/helloPage.jsp
}
	//http://localhost:8030/mvc/welcome
	@RequestMapping("/welcome")
public String welcome(){
	return "welcomePage";
	//WEB-INF/pages/welcomePage.jsp
}
	//http://localhost:800/mvc/getUserForm
	@RequestMapping("getUserForm")
	public String getUserForm(){
		return "sayHelloToUser";
		//WEB-INF/pages/sayHelloToUser.jsp	
	}
	//Display the form, enter the data, on submit call helloUser
	@RequestMapping(value="/helloUser",method=RequestMethod.POST)
	public String sayHelloToUser(HttpServletRequest request,Model model){
		String name=request.getParameter("name");
		model.addAttribute("message", "Welcome"+name);
		return "welcomePage";
	}
}
