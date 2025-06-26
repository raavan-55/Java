import java.util.Arrays;
import java.util.Scanner;
class SecondLargestNumberClass{
	int methodSecondLargestNumberClass(int arr[]){
		Arrays.sort(arr);
		int max=arr[0];
		int min=arr[0];
		for (int i = 0; i <=arr.length-1; i++) {
			if(arr[i]>max) {
				min=max;
				max=arr[i];
			}
			
		}
		return min;
	}
}

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int length=scan.nextInt();
		int arr[]=new int[length];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the element of index:"+i);
			arr[i]=scan.nextInt();
		}
		SecondLargestNumberClass ref=new SecondLargestNumberClass();
		int result=ref.methodSecondLargestNumberClass(arr);
        System.out.println("The second largest element in array is:"+result);
	}

}
