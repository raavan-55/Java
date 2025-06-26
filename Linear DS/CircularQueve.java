import java.util.Scanner;
public class CircularQueve {
private int circularQueve[];
private int rear=-1;
private int front=0;
private int count=0;
private Scanner scan=new Scanner(System.in);
public CircularQueve(int n) {
	circularQueve=new int[n];
}
public void insert(){
	if(count==circularQueve.length) {
		System.out.println("Insertion not possible......");
	}
else{
 System.out.println("Enter the element :");
 int num=scan.nextInt();
 rear=(rear+1)%circularQueve.length;
 circularQueve[rear]=num;
 ++count;
}
}
public void delete() {
	if(count==0) {
		System.out.println("Deletion not possible......");
	}
	else {
		System.out.println("The deleted element is "+circularQueve[front]);
		front=(front+1)%circularQueve.length;
		--count;
	}
}
public void display() {
	int disp=front;
	if(count==0) {
		
		System.out.println("Display not possible.....");
	}
	else {
		for (int i = 1; i <=count; i++) {
			System.out.print(circularQueve[disp]+" ");
			disp=(disp+1)%circularQueve.length;
		}
		System.out.println();
	}
}

}
