package javaProgramming;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x= "HE is aRAdHYA";
		String y = "is he HRADAYA";
		
		x = x.replace(" ","");
        y = y.replace(" ", "");
        
        x = x.toLowerCase();
        y = y.toLowerCase();
        
        char a [] = x.toCharArray();
        char b [] =y.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        Boolean result = Arrays.equals(a,b);
        
        if(result == true)
        {
        	System.out.print("Strings are anagram");
        }
        else
        {
        	System.out.print("Strings are not anagram");
        }
	}

}
