import java.util.Scanner;
class SelectionSortMethod{
	void selectionSort(int arrt[]){
		int first;
		int index;
		int swap;
		for (int i = 0; i <=arrt.length-2; i++) {
			        first=arrt[i];
			        index=i;
			        for (int j = i+1; j <=arrt.length-1; j++) {
			        	if(arrt[j]<first){
			        		first=arrt[j];
			        		index=j;
			        	}
			        	}
			        swap=arrt[i];
		        	arrt[i]=arrt[index];
		        	arrt[index]=swap;
		        	}
		}
}
public class SelectionSortUsingMethod {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of Array :");
	int a=scan.nextInt();
	int arr[]=new int[a];
	for (int i = 0; i <=arr.length-1; i++) {
		System.out.println("Enter the Element of array :");
		arr[i]=scan.nextInt();
	}
	SelectionSortMethod ref=new SelectionSortMethod();
	ref.selectionSort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
