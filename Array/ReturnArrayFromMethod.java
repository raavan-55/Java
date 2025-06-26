import java.util.Scanner;
class ArrayMethod{
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
public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		
		ArrayMethod ref=new ArrayMethod();
		int result[]=ref.arrayMethod();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		
		
		

	}

}
