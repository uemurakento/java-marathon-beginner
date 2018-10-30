package jp.co.rakus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameReceive")
public class NameReceiveController {

	@RequestMapping("/")
	public String index() {
		return "inputname";
	}
	
	@RequestMapping("/output")
	public String output(String name,HttpServletRequest request) {
		request.setAttribute("name", name);
		return "outputname";
	}
}
