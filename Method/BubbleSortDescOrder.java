import java.util.Scanner;
class BubbleMethodDes{
	void bubbleMethod(int arr2[]){
		int swap;
		for (int i = 0; i <=arr2.length-2; i++) {
			for (int j = 0; j <=arr2.length-2-i; j++) {
				    if(arr2[j]<=arr2[j+1])
				    {
				    	  swap=arr2[j+1];
				    	  arr2[j+1]=arr2[j];
				    	  arr2[j]=swap;
				    }
			}
		}
}}
class BubbleSortDescOrder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int arr[]=new int[len];
        for (int i = 0; i <=arr.length-1; i++) {
		System.out.println("enter the element :");
		arr[i]=scan.nextInt();
        }
        System.out.print("array before sorting :");
        for (int i = 0; i <=arr.length-1; i++) {
    		System.out.print(arr[i]+" ");  }
        BubbleMethodDes ref=new BubbleMethodDes();
		ref.bubbleMethod(arr);
		System.out.println();
		System.out.print("array after sorting :");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("yahooooooooooooooooooooooooooooooooooooooooooooooooooo");
  }
}


