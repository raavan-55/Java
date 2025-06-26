/*
A 01 B 02 C 03 D 04 E 05 
A 06 B 07 C 08 D 09 E 10 
A 11 B 12 C 13 D 14 E 15 
A 16 B 17 C 18 D 19 E 20 
A 21 B 22 C 23 D 24 E 25 
 */
public class Pattern30 {
public static void main(String[] args) {
	int num=1;
		for (int i = 1; i <=5; i++) {
			char x='A';
			for (int j = 1; j <=5; j++) {
				if(num<10) {
				System.out.print(x+" "+"0"+num+" ");
				}
				else {
					System.out.print(x+" "+num+" ");
				}
				x++;
                num++;
			}
			
			System.out.println();
		}
	}
}
