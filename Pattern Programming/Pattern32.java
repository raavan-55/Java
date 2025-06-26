/*
A 
A B 
A B C 
A B C D 
A B C D E  
*/
public class Pattern32 {

	public static void main(String[] args) {
		char c='A';
		for (int i = 1; i <=5; i++) {
			c='A';
			for (int j = 1; j<=i;j++ ) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			
		}

	}

}
