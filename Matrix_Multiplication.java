package javaProgramming;
import java.util.Scanner;
public class Matrix_Multiplication {

	public static void main(String[] args) {
		int a[][]= new int [3][3];
		int b[][]= new int [3][3];
		int c[][]= new int [3][3];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first matrix data");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the Second matrix data");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++ )
			{
				b[i][j]=s.nextInt();
				
			}
		}

			for(int i=0; i<3; i++) 
			{
				for(int j=0; j<3; j++ ) 
				{
					c[i][j]=0;
					for(int k=0; k<3;k++) 
					{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					
				}
			}
		}
			System.out.println("Multiple of two matrix ");
			for(int i=0; i<3; i++) 
			{
				for(int j=0; j<3; j++ ) 
				{
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
				}
	      }
	}

