package com.servlet;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	
	@RequestMapping("/xyz")
	public String abc() {
		return "test";
	}
	//http://localhost/jsp/test.jsp
	
	// http://ipaddress:port/success
	//http://ipaddress:port/<prefix><return><suffix>
	//http://ipaddress:port/jsp/welcome.jsp

	// http://localhost/success
	@RequestMapping("/success")
	public String welcome() {
		return "welcome";
	}
	// http://localhost/jsp/welcome.jsp
	
	@RequestMapping("/add2Cart")
	public String addCart() {
		return "AddingInCart";
	}
	
//customer types : http://ip:port/add2Cart
//send customer : http://ip:port/jsp/AddingInCart.jsp

// Prefix + return result + suffix
// /jsp/welcome.jsp
}
