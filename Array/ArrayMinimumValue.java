import java.util.Scanner;
public class ArrayMinimumValue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length of the Array :");
		   int a=scan.nextInt();
		   int arr[] =new int[a];
		   
		  for (int i = 0; i <= arr.length-1; i++) {
			  System.out.println("Enter "+(i+1)+" number :");
			arr[i]=scan.nextInt();
		}
		  System.out.println("The Elements are :");
		  for (int i = 0; i <= arr.length-1; i++) {
			  System.out.print(arr[i]+", ");
			
		}
		  System.out.println();
		int  min =arr[0];
		int position=0 ;
		  for (int i = 0; i < arr.length; i++) {
			  if (arr[i]<min) {
				  
				  min=arr[i];
				  position=i;
					
					
				}
			  }
		  System.out.println("The minimun value is "+min+" at position arr["+position+"]");
		}
		  
		 
		
	}


