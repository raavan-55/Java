
class MethodCallingTwoAr{
	void method(){
	System.out.println("method1");	
	}
	void method(int a){
		System.out.println("method int ");	
		}
	void method(byte a){
		System.out.println("method byte");	
		}
	void method(short a){
		System.out.println("method short");	
		}
	void method(long a){
		System.out.println("method long");	
		}
	void method(float a){
		System.out.println("method float");	
		}
	void method(double a){
		System.out.println("method double");	
		}
	
}
public class MethodCallingTwoArgument {

	public static void main(String[] args) {
		MethodCallingTwoAr ref=new MethodCallingTwoAr();
		ref.method(-11);
		
	}

}
