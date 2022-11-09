package javaProgramming;
import java.util.*;
public class String_Token {


		    public static void main(String[] args) {
		    	System.out.print("Enter a line");
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        s=s.trim();
		        String token[]=s.split("[^a-zA-Z]+");
		        if(s.length()==0)
		        {
		            System.out.println(0);
		            
		        }
		        else{
		            
		            System.out.println(token.length);
		            
		        }
		        for(String word:token){
		            System.out.println(word);
		            scan.close();
		        }
		        scan.close();
		    }
		}


