package jp.co.rakus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.service.CalcNumber;

@Controller
@RequestMapping("/calc")
public class CalcController {
	@Autowired
	private HttpSession session;
	@Autowired
	private CalcNumber calcNumber;
		
	@RequestMapping("/")
	public String index() {
		return "inputvalue";
	}
	
	@RequestMapping("/doCalc")
	public String doCalc(int num1,int num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("result", calcNumber.multi(num1, num2));
		return "outputvalue";
	}
	
	@RequestMapping("/output2")
	public String output2() {
		return "outputvalue2";
	}
}
