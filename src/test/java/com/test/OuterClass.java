package com.test;

public class OuterClass {


	public void SomeMethod() {
		
		System.out.println("SomeMethod");
		class StaticNestedClass {
			// Static nested class members

			public void NestedSum() {
				int a = 10;
				int b = 20;
				int sum;

				System.out.println(sum = a+b);
			}
		}StaticNestedClass snc = new StaticNestedClass();
		snc.NestedSum();
	}

	public static void main(String[] args) {
		
		OuterClass out=new OuterClass();
		out.SomeMethod();
		
	}

}
