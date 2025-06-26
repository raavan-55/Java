
public class FinalKeyword {

	public static void main(String[] args) {
		final int i=10;
		final int j;
		j=i+1;
		System.out.println(i);
		System.out.println(j);
		
		
	//error	i=20;
	//error	j=i+1;
		System.out.println(i);
		System.out.println(j);
		

	}

}
