import java.util.Collections;
import java.util.Scanner;

public class BirthDayCakeCandle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=scan.nextInt();
		int arr[]=new int[age];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter size of "+(i+1)+" candle");
			arr[i]=scan.nextInt();
		}
		int max=arr[0];
		for (int i = 0; i <=arr.length-1; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int count=0;
		for (int i = 0; i <=arr.length-1; i++) {
			if(arr[i]==max) {
				count++;
			}
		}
		System.out.println(count);
	}

}
