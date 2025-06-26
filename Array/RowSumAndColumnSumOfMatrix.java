import java.util.Iterator;
import java.util.Scanner;
class RowSumAndColumnSumOfMatrixClass{
	void rowSumAndColumnSumOfMatrixMethod(int arr[][]){
		for (int i = 0; i <=arr.length-1; i++) {
			int rowsum=0;
			int columnsum=0;
			int column=0;
		   for (int j = 0; j <=arr[i].length-1; j++) {
			columnsum=columnsum+arr[column][i];
			column++;
			rowsum=rowsum+arr[i][j];
		}
		   System.out.println("row "+(i+1)+" sum :"+rowsum);
		   System.out.println("column "+(i+1)+" sum :"+columnsum);
		 
		}
		System.out.println();
	}
}
public class RowSumAndColumnSumOfMatrix {
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
		RowSumAndColumnSumOfMatrixClass ref=new RowSumAndColumnSumOfMatrixClass();
		ref.rowSumAndColumnSumOfMatrixMethod(arr);
	}
}
