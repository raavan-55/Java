import java.util.Scanner;

public class Students {

 public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the length of the Array");
	int a=scan.nextInt();
	int arr[][]=new int[a][];
	for (int i = 0; i <=arr.length-1; i++) {
		System.out.println("Enter the length of Second Dimension of  arr["+i+"]");
		int b=scan.nextInt();
		arr[i]=new int[b];
	}
	for (int i = 0; i <= arr.length-1; i++) {
		for (int j = 0; j <= arr[i].length-1; j++) {
			System.out.println("Enter the age of student "+(j+1)+" of class "+(i+1));
			arr[i][j]=scan.nextInt();
		}
	}
	System.out.println("The array elements are :");
	for (int i = 0; i <= arr.length-1; i++) {
		for (int j = 0; j <= arr[i].length-1; j++) {
			System.out.print(arr[i][j]+" ");		
		}
		System.out.println();
	}	
}

}
