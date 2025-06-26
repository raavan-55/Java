import java.util.Scanner;
public class MatrixDiagonalDifference {
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size :");
	int size=scan.nextInt();
	int arr[][]=new int[size][size];
	for (int i = 0; i <=arr.length-1; i++) {
		for (int j = 0; j <=arr.length-1; j++) {
			System.out.println("Enter the value");
			arr[i][j]=scan.nextInt();
		}
	}
	System.out.println("The matrix is :");
	for (int i = 0; i <=arr.length-1; i++) {
		for (int j = 0; j <=arr.length-1; j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
    int diagonal1=0;
    int diagonal2=0;
    int ivalue=0;
	int jvalue=arr.length-1;
    for (int i = 0; i <=arr.length-1; i++) {
		for (int j = 0; j <=arr.length-1; j++) {
			if(i==j) 
			{
				diagonal1=diagonal1+arr[i][j];
			}
			if(i==ivalue && j==jvalue) 
			{
				diagonal2=diagonal2+arr[i][j];
				ivalue++;
				jvalue--;
			}
		}
	}
	
    if(diagonal1>diagonal2) {
    	System.out.println("difference between sum of diagonal is :"+(diagonal1-diagonal2));
    }
    else {
    	System.out.println("difference between sum of diagonal is :"+(diagonal2-diagonal1));
    }
	}

}
