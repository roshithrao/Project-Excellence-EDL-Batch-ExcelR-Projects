import java.util.ArrayList;


public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList ar = new ArrayList();    
		
		ar.add(12);
		ar.add("ExcelR");
		ar.add('B');
		ar.add(25.5);
		
	System.out.println(ar);
		
		ArrayList ar2 = new ArrayList();
	
		ar2.add(10);
		ar2.add(10);
		ar2.add(12);
		ar2.add(16);
		
		System.out.println(ar2);
		
		ar.addAll(ar2);
	
//		
//		System.out.println(ar);
//		
//		boolean b = ar2.contains(12);
//		
//		System.out.println(b);
//		
//		Object o = ar.get(2);
//		
//		System.out.println(o);
//		
//		int c = ar.size();
//		
//		System.out.println(c);
//		
//		
//		ArrayList ar3 = new ArrayList();
//		
//		ar3.add(1, 100);
//		
//		System.out.println(ar3);
//		
//		System.out.println(ar.getClass());
//		
//		ar2.ensureCapacity(5);
//		
//		System.out.println(ar2);
//		
//		System.out.println(ar2.size());
//		
//		ar2.trimToSize();
//		
//    //assigment for today : Practice other methods
//				
	}

}