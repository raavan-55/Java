import java.util.Arrays;
import java.util.Scanner;
public class ReplceOccurrenceString {
       public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Sentance :");
		String str=scan.nextLine();
		System.out.println("String is :"+str);
		System.out.println("String to replace :");
		String rep=scan.nextLine();
		System.out.println("Enter word to place:");
		String place=scan.nextLine();
		System.out.println("Occurence :");
		int occ=scan.nextInt();
		String arr[]=str.split(" ");
		int count=0;
		for (int i = 0; i <=arr.length-1; i++) {
			if(rep.equals(arr[i])) {
				count++;
			}
				if(count==occ) {
					arr[i]=place;
					}
			}
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
