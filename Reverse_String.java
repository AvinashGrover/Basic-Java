package javaProgramming;

public class Reverse_String {
	
	public static String reverseString(String str) {

	int i;
	String reversedString=" ";
	for( i=str.length()-1; i>=0; i--){
	    reversedString += str.charAt(i);
	    }
	return reversedString;
	}
	public static void main(String[] args) {
		 String str ="abcde";
		 String reverseString =reverseString(str);
		 System.out.print(reverseString);

	}

}
