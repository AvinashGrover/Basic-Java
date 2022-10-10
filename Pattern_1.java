package javaProgramming;

import java.util.Scanner;

public class Pattern_1 {

			public static void main(String[] args) {
				
				Scanner sc= new Scanner(System.in);
				System.out.print("enter a number");
				int n = sc.nextInt();
				int i =1;
				int h = 1 ;
				char a='A';

				while(i<=n) {
					int j=1;
					
					while(j<=i) {
						System.out.print(a+""+h);
						h++;
						j++;
					
						}
					a++;
					   System.out.println();

					i++;
					}
			}
	}


