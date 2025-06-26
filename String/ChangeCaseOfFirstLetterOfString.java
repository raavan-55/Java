import java.util.Scanner;
public class ChangeCaseOfFirstLetterOfString {
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Word :");
	String str=scan.nextLine();
	String strarr[]=str.split(" ");
	for (int j = 0; j <=strarr.length-1; j++) {
		System.out.print(strarr[j].substring(0,1).toUpperCase()+strarr[j].substring(1)+" ");
	}
	
	}
	}


