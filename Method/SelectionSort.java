import java.util.Scanner;
class Selection{
	void selection(int arr2[]){
		int min;
		int pos;
		int swap;
		for (int i = 0; i <=arr2.length-2; i++) {
			min=arr2[i];
			pos=i;
			for (int j =i+1; j <=arr2.length-1; j++) {
				if(arr2[j]<min){
					min=arr2[j];
					pos=j;
				}
				}
			   swap=arr2[i];
			   arr2[i]=arr2[pos];
			   arr2[pos]=swap;
		}
		 
		
	}
}

public class SelectionSort {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			System.out.println("Enter the length of Array :");
			int a=scan.nextInt();
	    	int arr[]=new int[a];
	    	for (int i = 0; i <=arr.length-1; i++) {
				System.out.println("Enter the Element of array :");
				arr[i]=scan.nextInt();
			}
	    	Selection ref=new Selection();
	    	ref.selection(arr);
	    	System.out.println("the sorted array is :");
			for (int i = 0; i <=arr.length-1; i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			}

	}


