package jp.co.rakus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@RequestMapping("/")
	public String index() {
		return "inputuserinfo";
	}
	
	@RequestMapping("/output")
	public String output(String name,String age,String address,HttpServletRequest request) {
		User user = new User(name,Integer.valueOf(age),address);
		request.setAttribute("user", user);
		return "outputuserinfo";
	}
}
