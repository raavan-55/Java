import java.util.ArrayDeque;
import java.util.Collections;
public class ArrayDequeClass {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println("_________________________");
		ad.add(10);
		ad.add(20);
		ad.add("Thirty");
		ad.add(false);
		ad.add(50.0);
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println("_________________________");
        ArrayDeque ad2=new ArrayDeque();
        ad2.addAll(ad);
        System.out.println(ad2);
		System.out.println(ad2.size());
		System.out.println("_________________________");
	    ad2.add(730);
		ad2.addFirst("First");
	    ad2.addLast("last");
	    System.out.println(ad2);
		System.out.println(ad2.size());
		System.out.println("_________________________");
	    ad2.add(ad);
	    System.out.println(ad2);
		System.out.println(ad2.size());
		System.out.println("_________________________");
		System.out.println(ad2.removeFirst()); //remove the first calue of the deque
		System.out.println(ad2.remove()); //remove the head value of the deque
		
		
	}

}
