package javaProgramming;
import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");

		int n = sc.nextInt();
		
		 int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				j++;
				System.out.print(" ");
			}
				j=1;
				while(j <= i) {
					System.out.print("*");
					j++;
				}
				
			System.out.println();
			i++;
		}
		
	 }
         
	}


