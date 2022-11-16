import java.util.Scanner;

public class Searching_the_Number {

	public static void main(String[] args) {
		System.out.print("Enter number of rows and columns");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int a[][]= new int[n][m];
		for(int i=0;i< a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]= sc.nextInt();
				
			}
		}
		 for(int i=0;i<a.length;i++) {
	        	for(int j=0 ; j<a[0].length; j++) {
	        		System.out.print(a[i][j]+" ");
	        	}
	        	System.out.println();
	        }
		
		System.out.print("Enter Number To Search");
		int x = sc.nextInt();
		
		for(int i=0; i< n;i++){
			for(int j=0; j<m;j++){
			
				if(a[i][j]==x) {
					System.out.print("x found at location("+ i +","+ j + ")");
				}
			}
		}

	}

}
