import java.util.Scanner;
class RemoveDublicatesClass{
 void methodRemoveDublicatesClass(int arr[]){
		int a=0;
	 
	 
	 for (int i = 0; i <arr.length-1; i++) {
		if(arr[i]!=arr[i+1]) {
			arr[a]=arr[i];
			a++;
			}
		}
	 arr[a]=arr[arr.length-1];
	 for (int i = 0; i <=a; i++) {
		System.out.print(arr[i]+" ");
	}
	}
}

public class RemoveDublicates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array :");
			arr[i]=scan.nextInt();
			}
		RemoveDublicatesClass ref=new RemoveDublicatesClass();
		ref.methodRemoveDublicatesClass(arr);
		
		

	}

}
