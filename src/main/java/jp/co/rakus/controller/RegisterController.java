package jp.co.rakus.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.service.RegisterTax;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private ServletContext application;
	@Autowired
	private RegisterTax registerTax;
	
	@RequestMapping("/")
	public String index() {
		return "buygoods";
	}
	
	@RequestMapping("/buy")
	public String buy(String item1,String item2,String item3) {
		List<Integer> list = new ArrayList<>();
		list.add(Integer.parseInt(item1));
		list.add(Integer.parseInt(item2));
		list.add(Integer.parseInt(item3));
		
		
		application.setAttribute("sum", registerTax.sum(list));
		application.setAttribute("tax", registerTax.tax(list));
		return "totalprice";
	}
}
