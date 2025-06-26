import java.util.Scanner;
class LinearMethod{
	int linearSearch(int arrt[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the key to search :");
		   int key=scan.nextInt();
		for (int i = 0; i <=arrt.length-1; i++) 
		{
			  if(arrt[i]==key){
				  
				  return i;
				  }
	     }
		System.out.println("Key is not found");
		return -1;
		}
	
}
class LinearSearchAlgoMethod {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int arr[]=new int[len];
        for (int i = 0; i <=arr.length-1; i++) {
		System.out.println("enter the element :");
		arr[i]=scan.nextInt();
	   }
      
	   LinearMethod reference=new LinearMethod();
      int result= reference.linearSearch(arr);
      if(result>=0){
      System.out.println("key is found at the index :"+result);
      }
	}

}
