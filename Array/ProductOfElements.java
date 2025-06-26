import java.util.Scanner;
class ProductOfElementsClass{
	int arrayMethod(){
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your array length :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter the elements in array :");
			arr[i]=scan.nextInt();
		}
		int product=1;
		for (int i = 0; i < arr.length; i++) {
			product=product*arr[i];
		}
		return product;
	}
}
public class ProductOfElements {

	public static void main(String[] args) {
		ProductOfElementsClass ref=new ProductOfElementsClass();
		System.out.println("the product of elements is :"+ref.arrayMethod());

	}

}
