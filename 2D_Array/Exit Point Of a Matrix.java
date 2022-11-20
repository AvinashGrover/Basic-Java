import java.util.Scanner;

public class Exit_Point_of_a_Matrix {

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
	    int dir =0;
	    int i =0;
	    int j=0;
	    while(true) {
	    	dir = (dir+a[i][j])%4;
	    	// direction = 0 move to east
	    	if(dir == 0) {
	    		j++;
	    	}
	    	// direction = 1 move to south
	    	else if(dir == 1) {
	    		i++;
	    }
	    	// direction = 2 move to west
	    	else if(dir == 2) {
	    		j--;
	    	}
	    	// direction = 3 move to north
	    	else if(dir == 3) {
	    		i--;
	    	}
	    	
	    	if(i <  0) {
	    		i++;
	    		break;
	    	}else if (j<0) {
	    		j++;
	    		break;
	    	}else if(i == a.length) {
	    		i--;
	    		break;
	    	}else if(j == a.length) {
	    		j--;
	    		break;
	    	}
	    }
	    System.out.print(i+","+j);
	}
}
