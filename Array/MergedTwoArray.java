public class MergedTwoArray {

	public static void main(String[] args) {
		int arr1[]={10,20,30,40,50};
		int arr2[]={60,70,80,90,100};
		int arr3[]=new int[arr1.length+arr2.length];
		for (int i = 0; i <=arr1.length-1; i++) {
			arr3[i]=arr1[i];
		}
		
		for (int i=0, j = arr1.length; j<=arr3.length-1;i++, j++)
		{
			arr3[j]=arr2[i];
		}
		
		System.out.print("the merged array are :");
		for (int i = 0; i < arr3.length-1; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		

	}

}
