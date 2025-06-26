public class ArrayDeclaration {
public static void main(String[] args) {
		System.out.println("One Dimention array:");
		int arr[]= {10,11,12,13,14,15,16,17,18,19,110};
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		System.out.print(arr[2]+" ");
		System.out.print(arr[3]+" ");
		System.out.print(arr[4]+" ");
		System.out.print(arr[5]+" ");
		System.out.print(arr[6]+" ");
		System.out.print(arr[7]+" ");
		System.out.print(arr[8]+" ");
		System.out.print(arr[9]+" ");
		System.out.println(arr[10]+" ");
		System.out.println("____________________");
		System.out.println("Two Dimention array:");
		int twoDArr[][]= {{200,201},{210},{220,221,222},{230,231,232,233,234,235}};
		System.out.print(twoDArr[0][0]+" ");
		System.out.println(twoDArr[0][1]+" ");
		System.out.println(twoDArr[1][0]+" ");
		System.out.print(twoDArr[2][0]+" ");
		System.out.print(twoDArr[2][1]+" ");
		System.out.println(twoDArr[2][2]+" ");
		System.out.print(twoDArr[3][0]+" ");
		System.out.print(twoDArr[3][1]+" ");
		System.out.print(twoDArr[3][2]+" ");
		System.out.print(twoDArr[3][3]+" ");
		System.out.print(twoDArr[3][4]+" ");
		System.out.println(twoDArr[3][5]+" ");
		System.out.println("______________________");
		System.out.println("Three Dimention array:");
		int threeDArr[][][]= {{{3000,3001,3002},{3010,3011}},{{3100}},{{3200,3201,3202},{3210},{3220,3221,3222,3223},{3230,3231}}};
        System.out.print(threeDArr[0][0][0]+" ");
        System.out.print(threeDArr[0][0][1]+" ");
        System.out.print(threeDArr[0][0][2]+":");
        System.out.print(threeDArr[0][1][0]+" ");
        System.out.println(threeDArr[0][1][1]+" ");
        System.out.println(threeDArr[1][0][0]+" ");
        System.out.print(threeDArr[2][0][0]+" ");
        System.out.print(threeDArr[2][0][1]+" ");
        System.out.print(threeDArr[2][0][2]+":");
        System.out.print(threeDArr[2][1][0]+":");
        System.out.print(threeDArr[2][2][0]+" ");
        System.out.print(threeDArr[2][2][1]+" ");
        System.out.print(threeDArr[2][2][2]+" ");
        System.out.print(threeDArr[2][2][3]+":");
        System.out.print(threeDArr[2][3][0]+" ");
        System.out.println(threeDArr[2][3][1]+" ");
	}

}
