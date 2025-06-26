class Producer extends Thread{
	Factory ref;
	Producer(Factory ref){
		this.ref=ref;
	}
	public void run() {
		int j=0;
		while(true) {
			ref.put(j++);
		}
	}
}
class Consumer extends Thread{
	Factory ref;
	Consumer(Factory ref){
		this.ref=ref;
	}
	public void run() {
		while(true) {
		ref.get();
		}
	}
}
class Factory {
	 int a;
	boolean production=false;
	synchronized void put(int i) {
		try {
		if(production==true) {
			wait();
			}
		else {
			a=i;
			System.out.println("put "+a+" in factory.");
			production=true;
			notify();
			
		}
		} catch (Exception e) {
				e.printStackTrace();
			}}
	
	
	synchronized void get() {
		try {
		if(production==false) {
			wait();
			} 
		else {
			System.out.println("get "+a+" from the factory");
			production=false;
			notify();
		}
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		}
}
 
public class ProducerConsumer {

	public static void main(String[] args) {
		Factory ref=new Factory();
		Producer t1=new Producer(ref);
		 Consumer t2=new Consumer(ref);
		 t1.start();
		 t2.start();
	}

}
