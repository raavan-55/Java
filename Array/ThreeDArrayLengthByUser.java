import java.util.Scanner;
 class ThreeDArrayLengthByUser {
   public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int a=scan.nextInt();
		int arr[][][]=new int[a][][];
		
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println("Enter the length of arr["+i+"] (second dimension):" );
			int b=scan.nextInt();
			arr[i]=new int[b][];
			
			}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= arr[i].length-1; j++) {
				System.out.println("Enter the length of arr["+i+"]["+j+"](third dimension):" );
				int c=scan.nextInt();
				arr[i][j]=new int[c];
		}
			}
		
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				for (int k = 0; k <= arr[i][j].length-1;k++) {
					System.out.println("Enter the marks of student "+k+" of class "+j+" of school "+i+":");
					arr[i][j][k]=scan.nextInt();
			}
			}
			}
		System.out.println("The array Elements are :");
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				for (int k = 0; k <= arr[i][j].length-1;k++) {
					
					System.out.print(arr[i][j][k]+" ");
					
				}
				System.out.println();
				
			}
			
		}

	}

}
