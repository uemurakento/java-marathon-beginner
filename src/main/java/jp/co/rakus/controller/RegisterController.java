package jp.co.rakus.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.service.RegisterTaxService;

/**
 * 3つの商品の値段を受け取るコントローラー.
 * 
 * @author kento.uemura
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private ServletContext application;
	@Autowired
	private RegisterTaxService registerTaxService;
	
	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		return "buygoods";
	}
	
	/**
	 * 商品の値段を受け取り、合計金額、その税込金額を出力する.
	 * 
	 * @param item1 商品1の値段
	 * @param item2 商品2の値段
	 * @param item3 商品3の値段
	 * @return 出力画面
	 */
	@RequestMapping("/buy")
	public String buy(String item1,String item2,String item3) {
		List<Integer> list = new ArrayList<>();
		list.add(Integer.parseInt(item1));
		list.add(Integer.parseInt(item2));
		list.add(Integer.parseInt(item3));
		
		
		application.setAttribute("sum", registerTaxService.sum(list));
		application.setAttribute("tax", registerTaxService.tax(list));
		return "totalprice";
	}
}
