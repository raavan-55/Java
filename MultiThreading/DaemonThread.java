class DaemonThreadClass extends Thread {
	void typing() throws Exception{
		for (int i = 0; i <5; i++) {
			System.out.println(i+1+": Typing..............");
		   Thread.sleep(500);
		}
	}
	void spellCheck() throws InterruptedException {
		for (; ; ) {
			System.out.println("Cheking the spelling");
			Thread.sleep(500);
		}
	}
	void saving() throws InterruptedException {
		for (; ; ) {
			System.out.println("Saving");
			Thread.sleep(500);		
		}
	}
	public void run() {
		if(Thread.currentThread().getName()=="Typing") {
			try {
				typing();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(Thread.currentThread().getName()=="SpellChecker") {
			try {
				spellCheck();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				saving();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class DaemonThread {
public static void main(String[] args) {
	DaemonThreadClass t1=new DaemonThreadClass();
	DaemonThreadClass t2=new DaemonThreadClass();
	DaemonThreadClass t3=new DaemonThreadClass();
		
		t1.setName("Typing");
		t2.setName("SpellChecker");
		t3.setName("Saving");
		
		t2.setDaemon(true);
		t3.setDaemon(true); 
		 
		t2.setPriority(7);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
