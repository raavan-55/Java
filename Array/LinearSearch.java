import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.print("Enter the legth of the array :");
		                int len=scan.nextInt();
		                int arr[]=new int[len];
		                for (int i = 0; i <=arr.length-1; i++) {
							System.out.println("Enter the elements :");
							       arr[i]=scan.nextInt();
						}
		                System.out.println("Enter the key to search :");
		                int key=scan.nextInt();
		                for (int i = 0; i <= arr.length-1; i++) {
							if(arr[i]==key){
								System.out.println("Key is found at the index : "+i);
								System.exit(0);
								}
		                }
		                System.out.println("Key is not found"); 
	}
}
		              
		                
	


