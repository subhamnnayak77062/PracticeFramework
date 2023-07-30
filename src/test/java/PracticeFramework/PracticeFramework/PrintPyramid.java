package PracticeFramework.PracticeFramework;

import java.util.Scanner;

public class PrintPyramid {

	public static void main(String[] args) {

		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the number of stars you want to print : "); 
		  int a =  sc.nextInt();
		 		  
		  for (int i = 1; i < a; i++) {
		  
		  for (int j = 1; j <= i; j++) {
		  
		  System.out.print("* ");
		  
		  } System.out.println(); }
		  
		  
		  sc.close();
		 

		/*
		 * for (int i = 1; i < 5; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("* "); //System.out.println("\t"); } System.out.println(); }
		 */
	}

}
