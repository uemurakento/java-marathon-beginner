package jp.co.rakus.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.Item;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	@Autowired
	private ServletContext application;
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Item> items = new LinkedList<>();
		items.add(new Item("手帳ノート",1000));
		items.add(new Item("文房具セット",1500));
		items.add(new Item("ファイル",2000));
		application.setAttribute("items", items);
		session.setAttribute("cartItems", new LinkedList<Item>());
		Integer sum = 0;
		model.addAttribute("sum",sum);
		return "itemandcart";
	}
	
	@RequestMapping("/inCart")
	public String inCart(String inItemName) {
		//ここで受け取ったアイテム名からアプリケーションスコープの中のリストの中のItemをとってきて、セッションスコープのほうのリストに格納する
		return null;
	}

}
