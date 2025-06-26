import java.util.Scanner;

class SmallestArrayMethod{
public int smallestNumber(int arrt[])
	{
		int min=arrt[0];
		for (int i = 0; i <= arrt.length-1; i++){
			  if(arrt[i]<min){
				  min=arrt[i];
			  }
			}
		return min;
		}}
public class SmallestNumberInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array :");
			arr[i]=scan.nextInt();
			}
		SmallestArrayMethod ref=new SmallestArrayMethod();
		int result=ref.smallestNumber(arr);
		System.out.println("the smallest number in array is :"+result);
		

	}

}
