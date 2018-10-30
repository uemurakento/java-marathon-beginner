package jp.co.rakus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;
import jp.co.rakus.repository.UserRepository;

/**
 * 主キーを受け取りそのデータをデータベースから出力するコントローラー.
 * 
 * @author kento.uemura
 *
 */
@Controller
@RequestMapping("/serch")
public class SearchController {
	@Autowired
	private UserRepository userRepository;

	/**
	 * 入力画面を出力する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String Index() {
		return "userinfosearch";
	}
	
	/**
	 * 主キーを受け取りデータベースからデータを出力する.
	 * 
	 * @param id 主キー
	 * @param model
	 * @return 出力画面
	 */
	@RequestMapping("/db")
	public String db(int id,Model model) {
		User user = userRepository.load(id);
		model.addAttribute("user", user);
		return "userinfoview";
	}
}
