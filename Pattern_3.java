package javaProgramming;

import java.util.Scanner;

public class Pattern_3 {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter a number");

				int n = sc.nextInt();
				
				 int i = 1;
				while(i<=n) {
					int spaces =1;
					while(spaces <=n -i) {
						spaces++;
						System.out.print(" ");
					}
						int j=1;
						int p=1;
						while(j <=i) {
							System.out.print(p);
							p++;
							j++;
						}
						p= i-1;
						j=1;
						while(j<=i-1) {
							System.out.print(p);
							p--;
							j++;
						}
					System.out.println();
					i++;
				}
				
			 }
		         
        }

