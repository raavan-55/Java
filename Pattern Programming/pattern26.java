/*
02 04 06 08 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50  
 */
public class pattern26 {
	public static void main(String[] args) {
		int k=2;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				
				if(k<10) {
				System.out.print("0"+k+" ");
				}
				else {
					System.out.print(k+" ");
				}
				k=k+2;
				
			}
			System.out.println();
		}

	}
}
