/*
  
          * 
        *   * 
      *       * 
    *           * 
  * * * * * * * * *
 
 * */
public class Pattern17 {

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

	}

}
