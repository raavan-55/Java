import java.util.Scanner;
public class Array {
	Scanner scan=new Scanner(System.in);
   private int arr[];
   public Array(int n) {
	  arr=new int[n]; 
   }
   public void insert() {
	   System.out.println("In which index you want Enter the number(index from 0 to"+(arr.length-1)+")");
	   int pos=scan.nextInt();
	   System.out.println("enter the number to Enter :");
	   int num=scan.nextInt();
	   arr[pos]=num;
   }
   public void delete() {
	   System.out.println("Enter the index to delete from 0 to "+(arr.length-1));
	   int pos=scan.nextInt();
	   arr[pos]=0;
	   }
   public void display() {
	   for (int i = 0; i <=arr.length-1; i++) {
		   
		System.out.println(arr[i]+" ");
	   }
	   }
   
}
