/*
01 03 05 07 09 
02 04 06 08 10 
11 13 15 17 19 
12 14 16 18 20 
21 23 25 27 29 
 */
public class Pattern27 {
   public static void main(String[] args) {
	   int k=1;
	   int l=2;
		for (int i = 1; i <=5; i++) {
			
			if(i%2!=0) {
				
			for (int j = 1; j <=5; j++) {
				if(k<10) {
				System.out.print("0"+k+" ");
				}
				else {
					System.out.print(k+" ");
				}
				k=k+2;
			}
			
		}
			else {
				
				for (int j = 1; j <=5; j++) {
					if(l<10) {
					System.out.print("0"+l+" ");
					}
					else {
						System.out.print(l+" ");
					}
					l=l+2;
			}
	 }
			System.out.println();
		

	}

}
  }
