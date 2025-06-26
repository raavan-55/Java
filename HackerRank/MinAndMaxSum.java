import java.util.Scanner;

public class MinAndMaxSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int[] arr=new int[len];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter elements ");
			arr[i]=scan.nextInt();
		}
		int swap;
		for (int i = 0; i <=arr.length-2; i++) {
			for (int j = 0; j <=arr.length-2-i; j++) {
				if(arr[j]>arr[j+1]) {
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
					
				}
			}
		}
		int min=0;
		int max=0;
		for (int i = 0; i <=arr.length-2; i++) {
			min=min+arr[i];
		}
		for (int i = 1; i <=arr.length-1; i++) {
			max=max+arr[i];
		}
		System.out.println(min+" "+max);

	}

}
