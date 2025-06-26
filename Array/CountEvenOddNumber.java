import java.util.Scanner;
class CountEvenOdd{
	void countEvenOdd(int arr[]) {
		int evencount=0;
		int oddcount=0;
		
		for (int i = 0; i <=arr.length-1; i++) {
			if(arr[i]%2==0) {
				evencount++;
				
			}
			else {
				oddcount++;
			}
		}
		
		System.out.println(evencount+" even numbers and "+oddcount+" odd numbers.");
		int evenarr[]=new int[evencount];
		int oddarray[]=new int[oddcount];
		int even=0;
		int odd=0;
		for (int i = 0; i <=arr.length-1; i++) {
		      if(arr[i]%2==0) {
		    	 evenarr[even]=arr[i];
		    	 even++;
		      }
		      else {
		    	  oddarray[odd]=arr[i];
		    	  odd++;
		      }
			}
		System.out.print("Even numbers :");
		for (int i = 0; i <=evenarr.length-1; i++) {
			System.out.print(evenarr[i]+" ");
		}
		System.out.println();
		System.out.print("Odd numbers :");
		for (int i = 0; i <=oddarray.length-1; i++) {
			System.out.print(oddarray[i]+" ");
		}
	}
}

public class CountEvenOddNumber {
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
		CountEvenOdd ref=new CountEvenOdd();
		ref.countEvenOdd(arr);
		}

}
