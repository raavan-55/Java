import java.util.Scanner;

class Student{
	int id;
	int age;
	String name;
	
}
public class UserArray {

	public static void main(String[] args) {
   Scanner scaning=new Scanner(System.in);
   System.out.println("Enter the number of the student :");
      int len=scaning.nextInt();
      
      Student s1=new Student();
      
      
     Student arr[]=new Student[len];
     for (int i = 0; i < arr.length-1; i++) {
		arr[i]=s1;
	}
     System.out.println("The Array Elements are :");
     
     for (int i = 0; i <=arr.length-1; i++) {
		System.out.print(arr[i].id+" "+arr[i].age+" "+arr[i].name+"|");
	}

	}

}
