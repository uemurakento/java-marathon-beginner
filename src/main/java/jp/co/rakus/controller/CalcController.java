package jp.co.rakus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.service.CalcNumberService;

/**
 * 2数を受け取り乗算結果を出力するコントローラー.
 * 
 * @author kento.uemura
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {
	@Autowired
	private HttpSession session;
	@Autowired
	private CalcNumberService calcNumberService;

	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		return "inputvalue";
	}

	/**
	 * 受け取ったパラメータの計算結果を出力する.
	 * 
	 * @param num1
	 *            1つ目の数
	 * @param num2
	 *            2つ目の数
	 * @return 出力画面
	 */
	@RequestMapping("/doCalc")
	public String doCalc(int num1, int num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("result", calcNumberService.multi(num1, num2));
		return "outputvalue";
	}

	/**
	 * 出力画面2を出力する.
	 * 
	 * @return 出力画面2
	 */
	@RequestMapping("/output2")
	public String output2() {
		return "outputvalue2";
	}
}
