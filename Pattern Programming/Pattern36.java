
/*
A B C D 
e f g h 
I J K L 
m n o p 
*/
public class Pattern36 {

	public static void main(String[] args) {
		int num=65;
        for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				if(i%2!=0) {
				System.out.print((char)num+" ");
				num++;
				}
				else {
					System.out.print((char)(num+32)+" ");
					num++;
					}
				}
			System.out.println();
		}
	}

}
