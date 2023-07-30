package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class LoadProperty {

	Properties prop = new Properties();
	String path = "E:\\Software\\MyNewWorkspace\\PracticeFramework\\Configuration\\config.properties";
	String userName_info;
	
public String ReadPropertyFile() throws IOException {
	

	FileInputStream fis = new FileInputStream(path);
	
		prop.load(fis);
		String pop = prop.getProperty("url", path);
		
		System.out.println(pop);
		return pop;
	
}

public void WritePropertyFile() throws IOException {
	
		FileOutputStream fos = new FileOutputStream(path);
		prop.setProperty("Title", "Edureka");
		prop.store(fos, null);
		
		System.out.println(prop);
		
}

public String generateRandomChars(String randomUser , int length) {
	StringBuilder sb = new StringBuilder();
	Random random = new Random();
	
	for (int i = 0; i < length; i++) {
		sb.append(randomUser.charAt(random.nextInt(randomUser.length())));
	}
	
	return sb.toString();
}


public String getRandomUserName() {
	
	//userName_info = null;
	
	String user_info = (generateRandomChars("ABCDFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 5));
	
	userName_info = user_info;
	return userName_info;
}

public static void main(String[] args) throws IOException {
	LoadProperty lp = new LoadProperty();
	lp.ReadPropertyFile();
	lp.WritePropertyFile();
}
}
