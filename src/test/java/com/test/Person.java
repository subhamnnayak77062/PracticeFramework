package com.test;

public class Person {
	
	private String name="ABC";
	
	
	public void SetName() {
		String name = "abc";
		System.out.println(name);
	}

	public void printName() {
		System.out.println(name);
	}
	
	public void checkName(String name) {
		name = "abc";
		System.out.println(this.name);
		this.name = name;
		System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.SetName();
		p.printName();
		p.checkName(null);
	}
}
