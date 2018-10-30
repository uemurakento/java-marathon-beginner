package jp.co.rakus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;
import jp.co.rakus.repository.UserRepository;

@Controller
@RequestMapping("/serch")
public class SearchController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String Index() {
		return "userinfosearch";
	}
	
	@RequestMapping("/db")
	public String db(int id,HttpServletRequest request) {
		User user = userRepository.load(id);
		request.setAttribute("user", user);
		return "userinfoview";
	}
}
