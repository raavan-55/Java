import java.util.Scanner;

public class DoublyLinkedListApp {
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
	while(true) {
		System.out.println("Press 1 ..................<-Insertfront");	
	    System.out.println("Press 2 ..................<-InsertRear");
		System.out.println("Press 3 ..................<-DeleteFront");
		System.out.println("Press 4 ..................<-DeleteRear");
		System.out.println("Press 5 ..................<-Displayforward");
		System.out.println("Press 6 ..................<-Displayreverse");
		System.out.println("Press 8 ..................<-exit");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice :");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:dll.insertfront();
		break;
		case 2:dll.insertrear();
		break;
		case 3:dll.deletefront();
		break;
		case 4:dll.deleterear();
		break;
		case 5:dll.displayforward();
		break;
		case 6:dll.displayreverse();
		break;
		default:System.exit(0);
		}
	}

	}

}
