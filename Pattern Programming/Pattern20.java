/*
 
               * 
              * * 
             *   * 
            *     * 
           *       * 
          *         * 
         *           * 
        *             * 
       *               * 
      *                 * 
     *                   * 
    *                     * 
   *                       * 
  *                         * 
 *                           * 
  *                         * 
   *                       * 
    *                     * 
     *                   * 
      *                 * 
       *               * 
        *             * 
         *           * 
          *         * 
           *       * 
            *     * 
             *   * 
              * * 
               * 

  
  
  
 */public class Pattern20 {

	public static void main(String[] args) {
		for (int i = 1; i <=15; i++) {
			for (int j = 15; j>=i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				if(j==1||j==i) {
				System.out.print("* ");
			}
            else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
            }
		for (int i = 1; i <=14; i++) {
			for (int j = 1; j <=1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = 14; j >= i; j--) {
				if(j==14||j==i) {
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
