import java.util.Scanner;
public class Queve {
  private int queve[];
  private int rear=-1;
 private int front=0;
 private Scanner scan=new Scanner(System.in);
 public Queve(int num) {
	 queve=new int[num];
 }
 public void insert() {
	 if(rear==queve.length-1) {
		 System.out.println("Insertion not possible........");
	 }
	 else {
		 System.out.println("Enter the number :");
		 int number=scan.nextInt();	
		 ++rear;
		 queve[rear]=number;
		 }
 }
 public void deletion() {
	 if(rear==-1 || front>rear) {
		 System.out.println("Deletion not possible...........");
		}
	 else {
		 System.out.println("The deleted element is "+queve[front]);
		 ++front;
		 }
 }
 public void display() {
	 if(rear==-1 || front>rear) {
		 System.out.println("Display not possible...........");
		}
	 else {
		 for (int i = front; i <=rear; i++) {
			System.out.print(queve[i]+" ");
		}
		 
	 }
	 System.out.println();
 }
}
