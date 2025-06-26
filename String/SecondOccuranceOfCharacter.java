import java.util.Scanner;
public class SecondOccuranceOfCharacter {
        public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=scan.nextLine();
		System.out.println("Enter the character :");
		char ch=scan.next().charAt(0);
		int count=0;
		int index=0;
		for (int i = 0; i <=str.length()-1; i++) {
			char c=str.charAt(i);
			if(c==ch) {
				count++;
				index=i;
				if(count==2) {
					System.out.println("second occurance of '"+ch+"' at index :"+index);
				}
			}
			
		}
		
	}

}
