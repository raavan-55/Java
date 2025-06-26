/*
01 02 03 04 05 
02 04 06 08 10 
03 06 09 12 15 
04 08 12 16 20 
05 10 15 20 25 */
public class Pattern37 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				int res=i*j;
				if(res<10) {
			System.out.print("0"+res+" ");	}
				
			
			else {
				System.out.print(res+" ");
			}
			}
			
			System.out.println();
		}

	}

}
