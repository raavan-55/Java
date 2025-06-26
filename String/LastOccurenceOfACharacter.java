import java.util.Scanner;
public class LastOccurenceOfACharacter {
        public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=scan.nextLine();
		System.out.println("Enter the character :");
		char ch=scan.next().charAt(0);
		int index=0;
		for (int i = 0; i <=str.length()-1; i++) {
			if(str.charAt(i)==ch) {
				index=i;
			}
		}
		System.out.println("last occurence of '"+ch+"' in string '"+str+"' at index "+index);
		

	}

}
