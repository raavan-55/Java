import java.util.Arrays;
import java.util.Scanner;
class ArrayM4{
	void  arrayMethod(){
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array1 length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array1 :");
			arr[i]=scan.nextInt();
		}
		System.out.print("The first array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("What is your array2 length :");
		int len2=scan.nextInt();
		int arr2[]=new int[len2];
		
		for (int i = 0; i <=arr2.length-1; i++) {
			System.out.println("Enter the elements in array2 :");
			arr2[i]=scan.nextInt();
		}
		System.out.print("The Second array is :");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		if(Arrays.equals(arr, arr2)){
			System.out.println("Arrays are equal.........");
		}
		else{
			System.out.println("Arrays are not equal....................");
		}
		
		
	}
}
public class ComapreTwoArray {

	public static void main(String[] args) {
		
		ArrayM4 ref=new ArrayM4();
		ref.arrayMethod();
			
	}}