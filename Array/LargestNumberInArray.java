import java.util.Scanner;
class LargestArrayMethod
{
    public int largestNumber(int arrt[])
	    {
		int max=arrt[0];
		for (int i = 0; i <= arrt.length-1; i++){
			  if(arrt[i]>max){
				  max=arrt[i];
			  }
			}
		return max;
		}
}
public class LargestNumberInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array :");
			arr[i]=scan.nextInt();
			}
		LargestArrayMethod ref=new LargestArrayMethod();
		int result=ref.largestNumber(arr);
		System.out.println("the lasgest number in array is :"+result);
		

	}

}
