import java.util.Scanner;
public class OccuranceOfCharacter {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Sentance :");
		String str=scan.nextLine();
		System.out.println("Enter the character :");
		char c=scan.next().charAt(0);
		System.out.println("Enter Occurence :");
		int occ=scan.nextInt();
		int count=0;
		char ch[]=new char[str.length()];
		for (int i = 0; i <=str.length()-1; i++) {
			ch[i]=str.charAt(i);
			if(ch[i]==c) {
				count++;
				if(count==occ){
System.out.println(occ+" occurance of character '"+c+"' in String "+str+" is at index "+i);
				}
			}
		}
		System.out.println("last occuurence at the index :"+str.lastIndexOf(c));

	}

	

}
