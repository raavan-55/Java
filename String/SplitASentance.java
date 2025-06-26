import java.util.Scanner;

public class SplitASentance {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Sentance :");
		String str=scan.nextLine();
		System.out.println(str);
		String strarr[]=str.split(" ");
		System.out.print("String is :");
		for (int i = 0; i <=strarr.length-1; i++) {
			System.out.print (strarr[i]+" ");
		}
		System.out.println();
		System.out.print("Output is :");
		for (int i = 0; i <=strarr.length-1; i++) {
			System.out.print(strarr[i].substring(0,1).toUpperCase()+strarr[i].substring(1)+" ");
		}
	}

}
