import java.util.Scanner;
class PositionCharacterClass{
	void positionCharacterMethod(String str) {
		System.out.println("Original String is :"+str);
		for (int i = 0; i <=str.length()-1; i++) {
			if(str.charAt(i)!=' ') {
			System.out.println("The character at position "+i+" is "+str.charAt(i));
			}
			else {
				System.out.println("The character at position "+i+" is Space");
			}
		}
	}
}
public class PositionCharacter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string :");
     String str=scan.nextLine();
     PositionCharacterClass ref=new PositionCharacterClass();
     ref.positionCharacterMethod(str);
	}

}
