import java.util.Scanner;
public class SinglyLinkedList {
   class Node{
	   int data;
	   Node link;
   }
   private Node first;
   private Scanner scan=new Scanner(System.in);
   void insertFirst() {
	   System.out.println("Enter the element :");
	   int ele=scan.nextInt();
	   Node refnodef=new Node();
	   refnodef.data=ele;
	   refnodef.link=null;
	   if(first==null) {
		   first=refnodef;
	   }
	   else {
		   refnodef.link=first;
		   first=refnodef;
	   }
	   }
   void insertRear() {
	   System.out.println("Enter the element :");
	   int ele=scan.nextInt();
	   Node refnoder=new Node();
	   refnoder.data=ele;
	   refnoder.link=null;
	   if(first==null) {
		   first=refnoder;
	   }
	   else {
		   Node temp=first;
		   while(temp.link!=null) {
			   temp=temp.link;
		   }
		   temp.link=refnoder;
	   }
   }
   
   void insertMid() {
	   System.out.println("Enter position .");
	   int pos=scan.nextInt();
	   System.out.println("Enter the Element");
	   int ele=scan.nextInt();
	   Node refnodem=new Node();
	   refnodem.data=ele;
	   refnodem.link=null;
	    Node temp=first;
	   int count=1;
	   while(temp.link!=null) {
		   temp=temp.link;
		    ++count;
	    if(count==pos) {
			   System.out.println(refnodem.data+" is inserted");
			   refnodem.link=temp.link;
			   temp.link=refnodem;
			 }
	   }
	}
	   
   void deleteFirst() {
	   if(first==null) {
		   System.out.println("Deletion not posible....");
	   }
	   else  if(first.link==null) {
		   System.out.println(first.data+" is deleted from link list.");
		   first=null;
	   }
	   else {
		   System.out.println(first.data+" is the deleted from link list.");
		   first=first.link;
	   }
   }
   
   void deleteRear() {
	   if(first==null) {
		   System.out.println("Deletion not posible....");
	   }
	   else  if(first.link==null) {
		   System.out.println(first.data+" is deleted from link list.");
		   first=null;
	   }
	   else {
		   Node temp=first;
		   while(temp.link.link!=null) {
			   temp=temp.link;}
		   System.out.println(temp.link.data+" is the deleted from link list.");
		   temp.link=null;
		   
	   }
   }
   
   void deleteMid() {
	  System.out.println("Enter the element which you want to delete.");
	  int ele=scan.nextInt();
	  Node temp=first;
	 
	  while(temp.link!=null) {
		   if(temp.data==ele) {
		  System.out.println(temp.link.data+" is the deleted element.");
		  temp.link=temp.link.link;
		  }
	   temp=temp.link;
	  }
	  
   }
	 
   void display() {
	   Node temp=first;
	   if(first==null) {
		   System.out.println("Display not possible.");
	   }
	   else if(first.link==null) {
		   System.out.println(first.data);
	   }
	   else {
		   
		   while(temp!=null) {
			   System.out.print(temp.data+" ");
			  temp=temp.link; 
		   }
		   System.out.println();
		   
	   }
	   
   }
   
}









