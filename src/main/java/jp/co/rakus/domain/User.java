package jp.co.rakus.domain;

/**
 * ユーザを表すドメイン
 * @author kento.uemura
 *
 */
public class User {
	private Integer id;
	/**名前フィールド*/
	private String name;
	/**年齢フィールド*/
	private Integer age;
	/**住所*/
	private String address;
	
	public User() {}
	public User(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public User(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
