package jp.co.rakus.domain;

public class User {
	private String name;
	private int age;
	private String address;
	
	//constructor
	public User() {}
	public User(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//setter,getter
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
