package jp.co.rakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/serch")
public class SearchController {

	@RequestMapping("/")
	public String Index() {
		return "userinfosearch";
	}
	
	@RequestMapping("/db")
	public String db() {
		return "userinfoview";
	}
}
