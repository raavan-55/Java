public class CurrentThreadMethod {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Second name");
		System.out.println(t);
		
	}

}
