/*
 ***   *** 
***** *****
***********
 *********
  *******
   *****
    ***
     *

 */
public class Pattern38 {

	public static void main(String[] args) {
		System.out.println(" ***   *** ");
		System.out.println("***** *****");
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 11; j >=(2*i)-1; j--) {
			System.out.print("*");
			}
			
			System.out.println();
			}
			
		}

	}


