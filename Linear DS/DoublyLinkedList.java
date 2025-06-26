import java.util.Scanner;
public class DoublyLinkedList {
   class Node{
	   Node previouslink;
	   int data;
	   Node nextlink;
   }
   private Node first;
   Scanner scan=new Scanner(System.in);
   
   public void insertfront()
   {
	   System.out.println("Enter the number.");
	   int num=scan.nextInt();
	   Node ref=new Node();
	   ref.previouslink=null;
	   ref.data=num;
	   ref.nextlink=null;
	   if(first==null) {
		   first=ref;
	   }
	   else {
		   ref.nextlink=first;
		  first.previouslink=ref; 
		  first=ref;
		  
	   }
   }
   public void insertrear() {
	   System.out.println("Enter the number.");
	   int num=scan.nextInt();
	   Node ref=new Node();
	   ref.previouslink=null;
	   ref.data=num;
	   ref.nextlink=null;
	   if(first==null) {
		   first=ref;
	   }
	   else {
		   Node temp=first;
		   while(temp.nextlink!=null) {
			   temp=temp.nextlink;
		   }
		   temp.nextlink=ref;
		   ref.previouslink=temp;
	   }
   }
   
   public void deletefront() {
	  if(first==null) {
		  System.out.println("Deletion not possible...");
	  }
	  else if(first.nextlink==null) {
		  System.out.println(first.data+" is deleted");
		  first=null;
	  }
	  else {
		  System.out.println(first.data+" is deleted");
		  first=first.nextlink;
		  first.previouslink=null;
	  }
   }
   
   public void deleterear() {
	   if(first==null) {
			  System.out.println("Deletion not possible...");
		  }
		  else if(first.nextlink==null) {
			  System.out.println(first.data+" is deleted");
			  first=null;
		  }
		  else {
			  Node temp=first;
			  while(temp.nextlink.nextlink!=null) {
				  temp=temp.nextlink;
			  }
			  System.out.println(temp.nextlink.data+" is deleted");
			  temp.nextlink=null;
			  
		  }
   }
   
   public void displayforward() {
	   if(first==null) {
			  System.out.println("Display not possible...");
		  }
		  else if(first.nextlink==null) {
			  System.out.println(first.data);
			  
		  }
		  else {
			  Node temp=first;
			  while(temp!=null) {
				  System.out.print(temp.data+" ");
				  temp=temp.nextlink;
			  }
		  }
	   System.out.println();
   }
   
   public void displayreverse() {
	   if(first==null) {
			  System.out.println("Display not possible...");
		  }
		  else if(first.nextlink==null) {
			  System.out.println(first.data);
			  
		  }
		  else {
			  Node temp=first;
			  while(temp.nextlink!=null) {
				  temp=temp.nextlink;
				  }
			  while(temp!=null) {
				  System.out.print(temp.data+" ");
				  temp=temp.previouslink;
			  }
		  }
	   System.out.println();
   }
}




















