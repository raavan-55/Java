import java.util.Scanner;

class User{
	int id;
	int age;
	String name;
}
class UsersArray {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the legth of the array :");
		int len=scan.nextInt();
		User arr[]=new User[len];
		for (int i= 0;i<=arr.length-1;i++) {
			arr[i]=new User();
		}
		for (int i= 0; i <=arr.length-1;i++) {
			System.out.println("Enter the ID of the student "+i);
			arr[i].id=scan.nextInt();
			System.out.println("Enter the Age of the student "+i);
			arr[i].age=scan.nextInt();
			System.out.println("Enter the Name of the student "+i);
			arr[i].name=scan.next();
		}
		for (int i = 0;i<=arr.length-1;i++) {
			System.out.println(arr[i].id+" "+arr[i].age+" "+arr[i].name);
			
		}
		
		
		
		
		
		

	}

}
