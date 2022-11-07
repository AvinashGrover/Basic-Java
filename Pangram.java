package javaProgramming;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		
		String a= "The quick brown fox jumps over the lazy dog";
		System.out.print(ispangram(a.toLowerCase()));
	}
	private static boolean ispangram(String s) {
		if(s.length()<26) {
			return false;
			
		}else
			for(char ch='a'; ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		   return true;
		   	   
	   }
	}

	


