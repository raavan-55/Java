/*
 
          * 
        *   * 
      *       * 
    *           * 
  * * * * * * * * * 
  *               * 
  *               * 
  *               * 
  *               * 
  *               * 
  *               * 
  *               * 
  *               * 
  *               * 
  * * * * * * * * * 
  
 
 * */
public class Pattern18 {
 public static void main(String[] args) {
	 for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print("  ");
			}
	          for (int j = 1; j <=2*i-1; j++) {
			   if(j==1 || j==2*i-1 || i==5  ) {
			       System.out.print("* ");
			     }
			else{
				 System.out.print("  ");
				 }
			
		}
		System.out.println();
		}
	 for (int i = 1; i <=10; i++) {
		 for (int j = 1; j <=1; j++) {
			System.out.print("  ");
		}
		 for (int j = 1; j <=9; j++) {
			 if(j==1||j==9|| i==10 ) {
			 System.out.print("* ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }
		 System.out.println();
	}
}
}
