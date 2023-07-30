package PracticeFramework.PracticeFramework;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static int[] a = {1,2,3,4,5};



	public static int sumOfArray(int[] a)
	{
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			//System.out.println(a[i]);

			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int sum = sumOfArray(a);
		System.out.println(sum);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();

		int multiply = multiplicationOfArray(num1,num2);
		System.out.println("The multiplication of "+num1+ " and "+num2+" is "+multiply);


		/*
		 * System.out.println("Enter your Name : "); String name = sc.nextLine();
		 * 
		 * System.out.println("Your name is " +name);
		 */

		sc.close();
	}

	private static int multiplicationOfArray(int i, int j) {

		int k=1 , sum=0;

		while(k<=j) {

			sum=sum+i;
			k++;
		}

		return sum;
	}
}
