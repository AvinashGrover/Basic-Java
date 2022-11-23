import java.util.Scanner;
public class Diagonal_Traversal {

	public static void main(String[] args) {
		System.out.print("Enter The Matrix Size");
          Scanner s = new Scanner(System.in); 
     //variable i denotes the starting of the element in rows  
     //loop execute till m-1 i.e. if matrix is m*n (3*3) the loop executes from i=0 to 2
          int n = s.nextInt();
          int m = s.nextInt();
          int a[][]= new int[n][m];
          for(int i=0;i<a.length;i++) {
        	  for(int j=0;j<a[0].length;j++) {
        		  a[i][j]=s.nextInt();
        	   }
        	 }
          
        	  for(int i=0;i<a.length;i++) {
        		  for(int j=0;j<a[0].length;j++) {
        			  System.out.print(a[i][j]+" ");
        			  }
        	  System.out.println();
          }
      //for loop for diagonals that starts from the first elements of the rows 
      //the first element of the diagonal starts form the g-th row  
      //the first element of the diagonal starts form the first column
           	for(int g=0;g<a.length;g++) {
    		      for(int i=0,j=g;j<a.length;i++,j++) {
        	  System.out.println(a[i][j]);
    		      }
           	} 
	   }
  }
