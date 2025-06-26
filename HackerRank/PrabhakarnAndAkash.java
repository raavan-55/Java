import java.util.Scanner;
public class PrabhakarnAndAkash {
        public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of the item :");
		int num=scan.nextInt();
		System.out.println("Enter the number of item akash dont like");
		int index=scan.nextInt();
		int arr[]=new int[num];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the price of "+(i+1)+" item:");
			arr[i]=scan.nextInt();
		}
		System.out.println("bill according to prabhakaran:");
		int pr=scan.nextInt();
		int sum=0;
		for (int i = 0; i <=arr.length-1; i++) {
			if(i!=index) {
				sum=sum+arr[i];
			}
		}
		System.out.println(pr-(sum/2));
	}

}
