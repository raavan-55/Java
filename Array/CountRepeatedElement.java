import java.util.Scanner;
class CountRepeatedElementClass{
	void methodCountRepeatedElementClass(int arr[]) {
		
		for (int i = 0; i <=arr.length-1; i++) {
			int count=1;
			for (int j = 0; j <=arr.length-1; j++) {
				if(i!=j && arr[i]==arr[j]) {
					++count;
				}
			}
			if(count>1) {
				int num=0;
				
				if(num!=arr[i]) {
				System.out.println(arr[i]+" is repeating "+count+" times.");
				}
				num=arr[i];
			}
		
		}
	}
}
public class CountRepeatedElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("What is "+i+" element of array :");
			arr[i]=scan.nextInt();
			}
		System.out.println("The Array Element are :");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		CountRepeatedElementClass ref=new CountRepeatedElementClass();
        ref.methodCountRepeatedElementClass(arr);
       
	}

}

