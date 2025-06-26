class MethodM1{
	void method(){
	System.out.println("method1");	
	}
	void method(int a){
		System.out.println("method int "+a);	
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
public class MethodCalling {

	public static void main(String[] args) {
		byte b=15;
		char c=(char)b;
		MethodM1 ref=new MethodM1();
		ref.method(c);
		
	}

}
