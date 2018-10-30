package jp.co.rakus.domain;

/**
 * 商品を表すドメイン.
 * 
 * @author kento.uemura
 *
 */
public class Item {
	/** 名前 */
	private String name;
	/** 値段 */
	private Integer price;

	public Item() {}

	public Item(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
