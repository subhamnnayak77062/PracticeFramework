package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		

		arr.add("W");
		arr.add("I");
		arr.add("N");
		arr.add("G");
		arr.add("S");

		System.out.println(arr);

		for(int i=0; i < arr.size(); i++){
			System.out.println(arr.get(i));

		}

		for (String i : arr) {
			System.out.println(i);
		}

		Iterator it = arr.iterator();

		while(it.hasNext()){
			System.out.println(it.next());

		}
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
		String ar [] = {"MBA" , "VOC" , "ACSS"};
		
		ArrayList al = new ArrayList(Arrays.asList(ar));
		System.out.println(al);
		
	}
	
}
