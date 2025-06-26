import java.util.Scanner;
public class Stack {
  private int stack[];
  private int top=-1;
  private Scanner scan=new Scanner(System.in);
  public Stack(int length) {
	  stack=new int[length];
  }
  public void push() {
	  
	  if(top==stack.length-1) {
		  System.out.println("Push not possible........");
	  }
	  else {
		  System.out.println("Enter the number :");
		  int num=scan.nextInt();
		  ++top;
		  stack[top]=num;
	  }
  }
  public void pop() {
	   if(top==-1) {
		  System.out.println("Pop not possible........");
	  }
	  else {
		  System.out.println("The pop element is :"+stack[top]);
		  --top;
		  }
  }
  public void display() {
	   if(top==-1) {
		  System.out.println("Display not possible........");
	  }
	  else {
		  for (int i = top; i >=0; i--) {
			  System.out.println(stack[i]);
		}
		}
 }
  
  
}
