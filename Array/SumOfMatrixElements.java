import java.util.Scanner;
class SumOfMatrixElementClass{
	 int sumOfMatrixElementMethod(int arr[][]){
		 int result=0;
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				result=result+arr[i][j];
			}
		}
		return result;
	}
}
public class SumOfMatrixElements {
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
		SumOfMatrixElementClass ref=new SumOfMatrixElementClass();
		int result=ref.sumOfMatrixElementMethod(arr);
		System.out.println("The sum of matrix element is :"+result);

	}

}
