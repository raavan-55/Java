import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		for (int i = 0; i<=arr.length-1; i++) {
			System.out.println("Enter an element :");
			arr[i]=scan.nextInt();
			}
		System.out.print("users array elemens are :");
		for (int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int help;
		for (int i = 0; i<=len-2; i++) {
			for (int j = 0; j<=len-2-i; j++) {
				if(arr[j]>arr[j+1]){
					help=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=help;
				}
				
			}
		}
		System.out.println();
		System.out.print("Sorted aray elemets are :");
		for (int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
