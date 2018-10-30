package jp.co.rakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;

/**
 * 名前、年齢、住所を受け取るコントローラー.
 * 
 * @author kento.uemura
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		return "inputuserinfo";
	}

	/**
	 * 受け取ったパラメータを出力する.
	 * 
	 * @param name
	 *            リクエストパラメータで送られてくる名前
	 * @param age
	 *            リクエストパラメータで送られてくる年齢
	 * @param address
	 *            リクエストパラメータで送られてくる住所
	 * @param model
	 * @return 出力画面
	 */
	@RequestMapping("/output")
	public String output(String name, String age, String address, Model model) {
		User user = new User(null, name, Integer.parseInt(age), address);
		model.addAttribute("user", user);
		return "outputuserinfo";
	}
}
