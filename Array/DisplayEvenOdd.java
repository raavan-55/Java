import java.util.Scanner;
class DisplayEO{
	void displayEvenOdd(int arr[]) {
		
		
		for (int i = 0; i <=arr.length-1; i++) {
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]+" Even");
				
			}
			else {
				
				System.out.println(arr[i]+" Odd");
			}
		}
		
		
	}
}

public class DisplayEvenOdd {
        public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array.");
		int len=scan.nextInt();
		int arr[]=new int[len];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print("Enter a number:");
			arr[i]=scan.nextInt();		
			}
		System.out.print("Array element is :");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		DisplayEO ref=new DisplayEO();
		ref.displayEvenOdd(arr);
		}

}
