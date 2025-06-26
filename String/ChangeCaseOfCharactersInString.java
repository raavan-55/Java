import java.util.Scanner;
public class ChangeCaseOfCharactersInString {
       public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=scan.nextLine();
		System.out.println("string is :"+str);
        char ch[]=str.toCharArray();
        for (int i = 0; i <=ch.length-1; i++) {
        	char c=ch[i];
			if(Character.isUpperCase(c)) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
			else {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
        str=String.valueOf(ch);
        System.out.println("Answer is:"+str);
	}

}
