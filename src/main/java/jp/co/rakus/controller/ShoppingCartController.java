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

/**
 * ショッピングカートの商品の追加、削除の結果を出力するコントローラー.
 * 
 * @author kento.uemura
 *
 */
@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	@Autowired
	private ServletContext application;
	@Autowired
	private HttpSession session;

	/**
	 * 初期画面、更新された画面を表示する.
	 * 
	 * @param model　モデル
	 * @return 表示する画面
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public String index(Model model) {
		if (application.getAttribute("items") == null) {
			List<Item> items = new LinkedList<>();
			items.add(new Item("手帳ノート", 1000));
			items.add(new Item("文房具セット", 1500));
			items.add(new Item("ファイル", 2000));
			application.setAttribute("items", items);
			session.setAttribute("cartItems", new LinkedList<Item>());
			Integer sum = 0;
			model.addAttribute("sum", sum);
		}
		Integer sum = 0;
		List<Item> cartItems = (List<Item>) session.getAttribute("cartItems");
		for (Item item : cartItems) {
			sum += item.getPrice();
		}
		model.addAttribute("sum", sum);
		return "itemandcart";
	}

	/**
	 * カートに商品を追加する.
	 * 
	 * @param itemNum
	 *            追加する商品のリストの番号
	 * @return indexにリダイレクト
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/inCart")
	public String inCart(int itemNum) {
		List<Item> items = (List<Item>) application.getAttribute("items");
		Item item = items.get(itemNum);
		List<Item> cartItems = (LinkedList<Item>) session.getAttribute("cartItems");
		cartItems.add(item);
		return "redirect:/shoppingCart/";
	}

	/**
	 * カートの商品を削除する.
	 * 
	 * @param itemNum
	 *            削除する商品のリストの番号
	 * @return indexにリダイレクト
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/outCart")
	public String outCart(int itemNum) {
		List<Item> items = (List<Item>) session.getAttribute("cartItems");
		items.remove(itemNum);
		return "redirect:/shoppingCart/";
	}

}
