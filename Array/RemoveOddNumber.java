import java.util.Scanner;
class RemoveOddNumberClass{
	void removeOddNumberMethod(int arr[]) {
		int evencount=0;
		for (int i = 0; i <=arr.length-1; i++) {
			if(arr[i]%2==0) {
				evencount++;
				}
			}
		System.out.println(evencount+" even numbers");
		int evenarr[]=new int[evencount];
		int even=0;
		for (int i = 0; i <=arr.length-1; i++) {
		      if(arr[i]%2==0) {
		    	 evenarr[even]=arr[i];
		    	 even++;
		    	 }
			}
		System.out.println("Removal of odd numbers is done.......");
		System.out.print("Array Elements is :");
		for (int i = 0; i <=evenarr.length-1; i++) {
			System.out.print(evenarr[i]+" ");
		}
		
	}
}

public class RemoveOddNumber {
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
		RemoveOddNumberClass ref=new RemoveOddNumberClass();
		ref.removeOddNumberMethod(arr);
		}

}
