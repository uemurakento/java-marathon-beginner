package jp.co.rakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 名前を受け取るコントローラー.
 * 
 * @author kento.uemura
 *
 */
@Controller
@RequestMapping("/nameReceive")
public class NameReceiveController {

	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		return "inputname";
	}
	
	/**
	 * 受け取った名前を出力する.
	 * 
	 * @param name リクエストパラメータで送られてくる名前
	 * @param request　
	 * @return
	 */
	@RequestMapping("/output")
	public String output(String name,Model model) {
		model.addAttribute("name", name);
		return "outputname";
	}
}
