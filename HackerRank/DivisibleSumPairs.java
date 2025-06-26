import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements :");
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the key :");
		int key=scan.nextInt();
		int count=0;
		int sum=0;
		for (int i = 0; i <=arr.length-2; i++) {
			for (int j = i+1; j <=arr.length-1; j++) {
			sum=arr[i]+arr[j];
			if(sum%key==0) {
				count++;
			}
			sum=0;
		}
		}
		System.out.println(count);

	}

}
