package PracticeFramework.PracticeFramework;

public class StringDemo {

	
		public static void main(String[] args) {
			
			//Reference variable will point the original object- no copy created in String pools memory
			String a = "hello"; //String Literal
			String b ="hello";
			a.concat("world");// original content cannot be updated --> cannot perform any operation on String a // this is immutable
			String c= a.concat("world");
			
			
			// String class will creates new objects every time - copy created in String pools memory
			String s = new String("hello");// creates new object of string class
			String s1 = new String("hello");
			
			System.out.println(a.equals(b));
			System.out.println(a==b);
			System.out.println(a.equals(s));// equals operator checks for content : true
			System.out.println(a==s);// fail matching the references ==   :  False
			
			System.out.println(s==s1);//fail reference are different as they are defined with String class
			
			System.out.println(c);

			//StringBuffer and StringBuilder - mutable
			StringBuffer sb = new StringBuffer("hello");
			sb.append("world"); // it is mutable so it will perform the update action on hello
			System.out.println(sb);
			sb.insert(2, "She");
			System.out.println(sb);
			sb.replace(5, 7, "aa");//5, 6th chars are replaced
			System.out.println(sb);
			sb.deleteCharAt(12);
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
			//StringBuilder is not thread safe or not non synchronize// it is faster
			
			
		}
	
	
}
