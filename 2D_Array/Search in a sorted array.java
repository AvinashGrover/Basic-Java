// Java program to search an element in row-wise and column-wise sorted matrix
import java.util.Scanner;

public class Search_In_A_Sorted_Array {

	public static void main(String[] args) {
    // Enter a sorted matrix
		System.out.print("Enter A Matrix");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int a[][]= new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0; j<m ; j++) {
				a[i][j]=s.nextInt();
				
			}
		}
			for(int i=0;i<n;i++) {
				for(int j=0; j<m ; j++) {
					System.out.print(a[i][j]+" ");
		}
				System.out.println();
			}
    // Enter the element to search
		System.out.print("Enter Element to Search");
		
		int x = s.nextInt();
		int i=0;
		int j = a[0].length-1;
		// traverse through the matrix
		while( i < a.length && j>=0) {
      // if the element is found
			if(x == a[i][j]) {
				System.out.print("Element Found at Index");
				System.out.print(i);
				System.out.print(","+ j);
				return;
			}else if(x < a[i][j]) {
				j--;
			}else {
				i++;
			}
		}
// if the elemrnt is not found
		 System.out.println("Not Found");
	}

 }

