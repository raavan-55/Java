import java.util.Scanner;
class MatrixAdditionClas{
	int[][] matrixAdditionMethod(int arr1[][],int arr2[][]) {
		int sum[][]=new int[arr1.length][arr1.length];
		for (int i = 0; i <=arr1.length-1; i++) {
			for (int j = 0; j <=arr2.length-1; j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return sum;
	}
}
public class MatrixAddition {
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
		MatrixAdditionClas ref=new MatrixAdditionClas();
		int result[][]=ref.matrixAdditionMethod(arr,arr2);
		System.out.println("Sum of First and Second Matrix is :");
		for (int i = 0; i <=result.length-1; i++) {
			for (int j = 0; j <=result[i].length-1; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
