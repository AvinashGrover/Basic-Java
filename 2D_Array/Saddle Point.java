// Java program to illustrate Saddle point
 
import java.util.Scanner;
public class Saddle_Point {

	public static void main(String[] args) {
    // Enter a matrix as input
		System.out.println("Enter a Matrix");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();		
		int m = s.nextInt();
		int a[][]= new int[n][m];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=s.nextInt();
			}
		}
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					System.out.print(" "+a[i][j]);
				}
				System.out.println();
			}
        // Find the minimum element of row i.
        // Also find column index of the minimum element
			  for(int i=0;i<a.length;i++) {
				  int svj=0;
				for(int j=1;j<a[0].length;j++) {
					if(a[i][j]<a[i][svj]) {
						svj = j;
					}
				}
        // Check if the minimum element of row is also
        // the maximum element of column or not
				boolean flag =true;
				for(int k =0; k<a.length;k++) {
        // Note that svj is fixed  
					if(a[k][svj]>a[i][svj]) {
						flag=false;
						break;
					}
				}
        // If saddle point is present in this row then
        // print it 
				if(flag == true) {
					System.out.print(a[i][svj]+" is the Saddle Point of the Matrix" );
					return;
				}
			  }
        // If Saddle Point not found
			  System.out.println("Invalid Input");
	  }

}
