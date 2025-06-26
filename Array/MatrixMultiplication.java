import java.util.Scanner;
class MatrixMultiplicationClass{
	int[][] matrixMultiplicationMethod(int arr1[][],int arr2[][]){
		int mul[][]=new int[arr1.length][arr1.length];
		for (int i = 0; i <=mul.length-1; i++) {
			for (int j = 0; j <=mul.length-1; j++) {
				for (int k = 0; k <=mul.length-1; k++) {
					mul[i][j]=mul[i][j]+arr1[i][k]*arr2[k][j];
				}
			}
		}
		return mul;
	}
}
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of matrixes :");
		int size=scan.nextInt();
		int arr[][]=new int[size][size];
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				System.out.print("Enter First Matrix element "+i+j+" :");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The First matrix is :");
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		int arr2[][]=new int[size][size];
		for (int i = 0; i <=arr2.length-1; i++) {
			for (int j = 0; j <=arr2[i].length-1; j++) {
				System.out.print("Enter Second Matrix element "+i+j+" :");
				arr2[i][j]=scan.nextInt();
			}
		}
		System.out.println("The Second matrix is :");
		for (int i = 0; i <=arr2.length-1; i++) {
			for (int j = 0; j <=arr2[i].length-1; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
			
		}
		MatrixMultiplicationClass ref=new MatrixMultiplicationClass();
		int result[][]=ref.matrixMultiplicationMethod(arr,arr2);
		System.out.println("Mulipliation of above two Matrix is :");
		for (int i = 0; i <=result.length-1; i++) {
			for (int j = 0; j <=result[i].length-1; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
