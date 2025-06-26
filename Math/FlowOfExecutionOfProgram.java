public class FlowOfExecutionOfProgram {
	static int a;
	int b;
	static {
		System.out.println("Note-Execution of program is starting from static block if static block is not present than execution start from main() mehtod");
	}
	{
		System.out.println("(Instance block 1)Execution of instance block are start while object creation before constuctor calling.");
	}
static void staticMethod() {
	System.out.println("static method");
}
static void staticMethod2() {
	System.out.println("static method 2");
}
static {
	System.out.println("static block");
}
FlowOfExecutionOfProgram(){
	System.out.println("Constructor");
	
}
void method() {
	System.out.println("non static method");
}

{
	System.out.println("instance block");
}
static {
	System.out.println("static block 2");
}
public static void main(String[] args) {
	
	
	
	FlowOfExecutionOfProgram.staticMethod();
	FlowOfExecutionOfProgram ref=new FlowOfExecutionOfProgram();
	FlowOfExecutionOfProgram.staticMethod2();
	ref.method();
	System.out.println("Static variable intialised by jvm to it sdefault value "+FlowOfExecutionOfProgram.a);
	System.out.println("Instance variable initialised by constuctor of Object class constructor by super() method to its defalut value "+ref.b);
}
}
