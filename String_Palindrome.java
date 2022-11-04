package javaProgramming;

 import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		
		String str, reverse="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string");
		
		str= sc.nextLine();
		int length = str.length();
		
		for (int i = length-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
			
		}
		
		if( str.equals(reverse))
		{
			System.out.println(str + " is a palindrom");
			
		}
		else {
			System.out.println(str + " is not a palindrom");
		}

	}

}
