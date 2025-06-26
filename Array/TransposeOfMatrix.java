import java.util.Scanner;
class TransposeOfMatrixClass{
	int[][] transposeOfMatrixmethod(int arr[][]) {
		int transpose[][]=new int[arr.length][arr.length];
		for (int i = 0; i <=transpose.length-1; i++) {
			int column=0;
			for (int j = 0; j <=transpose[i].length-1; j++) {
				transpose[i][j]=arr[column][i];
				column++;
				}
			}
		return transpose;
	}
}
public class TransposeOfMatrix {
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
		TransposeOfMatrixClass ref=new TransposeOfMatrixClass();
		int result[][]=ref.transposeOfMatrixmethod(arr);
		System.out.println("Transpose of above matrix :");
		for (int i = 0; i <=result.length-1; i++) {
			for (int j = 0; j <=result[i].length-1; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
