import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	
System.out.println("Enter the Length of the Array :");
int len=scan.nextInt();
int arr[]=new int[len];
for (int i = 0; i <=arr.length-1; i++) {
	System.out.println("Enter the Elements :");
	      arr[i]=scan.nextInt();
}
System.out.println("Enter key to Search :");
int key=scan.nextInt();

int low=0;
int high=arr.length-1;
int mid;
while (low<=high) 
{
	
	mid=(high+low)/2;
if(arr[mid]==key){
	System.out.println("String is found at the index :"+mid);
	System.exit(0);
}
else if(arr[mid]<key){
	low=mid+1;
	high=high;
}
else{
	low=low;
	high=mid-1;
}

}
System.out.println("Key not found :");
	}

}
