import java.util.Scanner;
class RemoveEvenNumberClass{
	void removeEvenNumberMethod(int arr[]) {
		int oddcount=0;
		for (int i = 0; i <=arr.length-1; i++) {
			if(arr[i]%2!=0) {
				oddcount++;
				}
			}
		System.out.println(oddcount+" odd numbers.");
			int oddarray[]=new int[oddcount];
		int odd=0;
		for (int i = 0; i <=arr.length-1; i++) {
		      if(arr[i]%2!=0) {
		    	  oddarray[odd]=arr[i];
		    	  odd++;
		    	 }
		      
			}
		System.out.println("Removal of Even numbers is done.....");
		System.out.print("Array Elements is :");
		for (int i = 0; i <=oddarray.length-1; i++) {
			System.out.print(oddarray[i]+" ");
		}
	}
}
	
public class RemoveEvenNumbers {
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
		RemoveEvenNumberClass ref=new RemoveEvenNumberClass();
		ref.removeEvenNumberMethod(arr);
		}
}
