import java.util.ArrayList;
import java.util.LinkedList;


public class LaunchLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		LinkedList ll1 = new LinkedList();
		
		
		ll1.add(10);
		
		ll1.add(100);
		
		ll1.add("Roshith");
		
		ll1.add("ExcelR");
		
		ll1.add('A');
		
		System.out.println(ll1);
		
		ll1.addFirst(12);
		
		ll1.addLast(10);
		
		System.out.println(ll1);
		
		ArrayList ar1 = new ArrayList();
		
		ar1.add(1000);
		
		ar1.add(2000);
		
		ar1.add(3000);
		
		
		ll1.addAll(ar1);
		
		
		System.out.println(ll1);
		
		ll1.add(1, 11);
		
		System.out.println(ll1);
		
		LinkedList ll2 = new LinkedList();
		
		ll2.add(10);
		
		ll2.offer(11);
		
		
		
		System.out.println(ll2);			
		
		
	}

}
