/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 

 */
public class Pattern29 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			char x='A';
			for (int j = 1; j <=5; j++) {
				System.out.print(x+" ");
				x++;
			}
			
			System.out.println();
		}
	}
}
