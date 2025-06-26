import java.util.Scanner;
class ArrayM3{
	int arrayMethod(){
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array :");
			arr[i]=scan.nextInt();
		}
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum/arr.length;
		
	}
}
public class AverageOfArray {

	public static void main(String[] args) {
		
		ArrayM3 ref=new ArrayM3();
		int result=ref.arrayMethod();
			System.out.print("Average of array elements is :"+result);		

	}

}
