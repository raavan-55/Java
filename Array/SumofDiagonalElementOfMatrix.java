import java.util.Scanner;
class SumofDiagonalElementOfMatrixClass{
	int sumofDiagonalElementOfMatrixMethod(int arr[][]){
		int sum=0;
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				if(i==j) {
					
				sum=sum+arr[i][j];
				
				}
			}
		}

		return sum;
	}
}
public class SumofDiagonalElementOfMatrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the matrix :");
		int size=scan.nextInt();
		int arr[][]=new int[size][size];
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				System.out.print("Enter the element "+i+j+" :");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The matrix is :");
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		SumofDiagonalElementOfMatrixClass ref=new SumofDiagonalElementOfMatrixClass();
		System.out.println("Sum of diagonal element of matrix is :"+ref.sumofDiagonalElementOfMatrixMethod(arr));
		 
	}
	}
