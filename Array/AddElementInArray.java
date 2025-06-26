import java.util.Scanner;
class AddElement{
	Scanner scan=new Scanner(System.in);
   int[] addElementMethod(int arr2[]) {
	  System.out.println("Enter the index where the new element store."); 
	  int pos=scan.nextInt();
	  System.out.println("Enter the new element :"); 
	  int element=scan.nextInt();
	   int arr3[]=new int[arr2.length+1]; 
	   for (int i = 0; i <pos; i++) {
			  arr3[i]=arr2[i];
			}
	   arr3[pos]=element;
	   for (int i = pos+1; i <=arr3.length-1; i++) {
		   arr3[i]=arr2[i-1];
			  }
	   return arr3;
	   }
   }
public class AddElementInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("What is "+i+" element of array :");
			arr[i]=scan.nextInt();
			}
		System.out.print("The Array Element are :");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		AddElement ref=new AddElement();
		int result[]=ref.addElementMethod(arr);
		System.out.print("The new Array are :");
		for (int i = 0; i <=result.length-1; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
