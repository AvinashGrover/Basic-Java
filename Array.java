package javaProgramming;

import java.util.Scanner;

public class Array {

	
			public static int[]takeinput(){
				int[] arr = new  int[20];
		        
		        Scanner s = new Scanner(System.in);
		        int size = s.nextInt();
		        int input[] = new  int[size];
		        for(int i=0; i < size; i++) {
		     	   
		          input[i] = s.nextInt();
			}
		        return input;
			}
			
			public static void print(int input []) {
				int size = input.length;
				for(int i=0; i<size; i++) {
		     	   System.out.println(input[i] +"");
				} 
				System.out.println();
			}

			public static void main(String[] args) {
				
				int arr[] = takeinput();
				print(arr);
		           
		             
		    
			}

		}


