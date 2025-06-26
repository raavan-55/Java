import java.util.Scanner;
class Insertion{
	void insertionSort(int arr2[]){
		int item;
		int j;
			for (int i = 1; i <=arr2.length-1; i++) {
			    item=arr2[i];
			      j=i-1;
			    while(j>=0 && arr2[j]>item){
			    	arr2[j+1]=arr2[j];
			    	j--;
			    }
			    arr2[j+1]=item;
		}
	
		
	}
	
}

class InsertionSort {
       public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array :");
		int a=scan.nextInt();
    	int arr[]=new int[a];
    	for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the Element of array :");
			arr[i]=scan.nextInt();
		}
    	Insertion ref=new Insertion();
    	ref.insertionSort(arr);
    	System.out.println("the sorted array is :");
		for (int i = 0; i <=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
