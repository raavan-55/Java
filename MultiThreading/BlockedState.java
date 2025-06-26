class BlockedStateClass extends Thread{
	String a="talwar";
	String b="dhanush";
	String c="gada";
	public void run() {
		if(getName()=="karn") {
			karn();
		}
		else {
			arjun();
		}
	}
	void karn() {
		try {
			Thread.sleep(2000);
		synchronized (a) {
			System.out.println("karna k pas "+a+" hai");
			Thread.sleep(2000);
			synchronized (b) {
				System.out.println("karna k pas "+b+" hai");
				Thread.sleep(2000);
				synchronized (c) {
					System.out.println("karna k pas "+c+" hai");
					
				}
				
			}
		}
		   } catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	void arjun() {
		try {
			Thread.sleep(2000);
			synchronized (a) {
				System.out.println("arjun k pas "+a+" hai");
				Thread.sleep(2000);
				synchronized (b) {
					System.out.println("arjun k pas "+b+" hai");
					Thread.sleep(2000);

					synchronized (c) {
						System.out.println("arjun k pas "+c+" hai");
											}
					
				}
			}
			   } catch (InterruptedException e) {
					e.printStackTrace();
				}
			
	
}
}
public class BlockedState {

	public static void main(String[] args) {
		BlockedStateClass t1=new BlockedStateClass();
		BlockedStateClass t2=new BlockedStateClass();
		t1.setName("karn");
		t2.setName("arjun");
		t1.start();
		t2.start();
		
	}

}
