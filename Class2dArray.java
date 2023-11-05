package pack2;
import java.util.Scanner;
import java.util.Arrays;
public class Class2dArray {
static void swapDiagnols() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row size:");
	int rowsize=sc.nextInt();
	System.out.println("Enete column size");
	int columnsize=sc.nextInt();
	int[][]arr=new int[rowsize][columnsize];
	System.out.println("Enter "+rowsize*columnsize+" values in 2d array");
	for(int i=0;i<rowsize;i++) {
		for(int j=0;j<columnsize;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<rowsize;i++) {
		for(int j=0;j<columnsize;j++) {
			System.out.print(arr[i][j]+" ");
			int copy=arr[i][i];
			arr[i][i]=arr[i][rowsize-1-i];
			arr[i][rowsize-1-i]=copy;
		}
		System.out.println();
		}
	System.out.println("Swap matrix is");
	for(int i=0;i<rowsize;i++) {
		for(int j=0;j<columnsize;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
			
	
}
	

public static void main(String[] args) {
	swapDiagnols();
}

}
	
/*
 I/P:
 Enter row size:
3
Enete column size
3
Enter 9 values in 2d array
 1 2 3
      4 5 6
      7 8 9
      O/P:
1 2 3 
4 5 6 
7 8 9 
Swap matrix is
3 2 1 
4 5 6 
9 8 7 
	
 */
	
	
	
	
	
	