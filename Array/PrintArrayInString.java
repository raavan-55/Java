
import java.util.Arrays;
import java.util.Scanner;
class ArrayM1{
	int[] arrayMethod(){
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array :");
			arr[i]=scan.nextInt();
		}
		return arr;
	}
}
public class PrintArrayInString {

	public static void main(String[] args) {
		
		ArrayM1 ref=new ArrayM1();
		int result[]=ref.arrayMethod();
			System.out.print(Arrays.toString(result));
		
		
		
		

	}

}
