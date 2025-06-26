import java.util.Scanner;
public class SinglyLinkedListApp {

	public static void main(String[] args) {
		SinglyLinkedList ll=new SinglyLinkedList();
	while(true) {
		System.out.println("Press 1 ..................<-InsertFront");
		System.out.println("Press 2 ..................<-InserMid");
		System.out.println("Press 3 ..................<-InsertRear");
		System.out.println("Press 4 ..................<-DeleteFront");
		System.out.println("Press 5 ..................<-DeleteMid");
		System.out.println("Press 6 ..................<-DeleteRear");
		System.out.println("Press 7 ..................<-Display");
		System.out.println("Press 8 ..................<-exit");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice :");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:ll.insertFirst();
		break;
		case 2:ll.insertMid();
		break;
		case 3:ll.insertRear();
		break;
		case 4:ll.deleteFirst();
		break;
		case 5:ll.deleteMid();
		break;
		case 6:ll.deleteRear();
		break;
		case 7:ll.display();
		break;
		default:System.exit(8);
		}
	}

	}

}
