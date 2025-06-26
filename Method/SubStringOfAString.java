import java.util.Scanner;
class SubString{
	String stringSubString(String st,int a)
	{  
        char ch[]=st.toCharArray();
        char ch2[]=new char[ch.length-a];
        int j=0;
        for (int i = a; i <=ch.length-1; i++) {
			     ch2[j]=ch[i];
			     j++;
		}
        String s=new String(ch2);
        return s;
      }
	
	 String stringSubString(String st,int a,int b)
	{  
    char ch[]=st.toCharArray();
    char ch2[]=new char[b-a+1];
    int z=0;
    for (int i = a; i <=b; i++) 
      {
		     ch2[z]=ch[i];
		     z++;
	    }
    String s1=new String(ch2);
    return s1;
 }
	
}


class SubStringOfAString {
    public static void main(String[] args)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the String :");
        String str=scan.nextLine();
    	SubString ref=new SubString();
		System.out.println("Enter the first index of Substring :");
        int first=scan.nextInt();
        String result=ref.stringSubString(str,first);
        System.out.print("The substing is :");
        System.out.println(result);
        System.out.println("Enter first String :");
        int firstOne=scan.nextInt();
        System.out.println("Enter Second String :");
        int secondOne=scan.nextInt();
        String result2=ref.stringSubString(str,firstOne,secondOne);
        System.out.print("The substing is :");
        System.out.println(result2);
        }

}
