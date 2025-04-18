import java.util.*;


public class LaunchIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList al = new ArrayList();
      
      al.add(1000);
      al.add(150);
      al.add(2000);
      al.add(300);
      al.add(400);
      al.add(500);
      al.add("ExcelR");
      al.add("hyd");
      
    
	  //for loop
      for(int i=0;i<al.size();i++)
      {
    	  System.out.println(al.get(i));
      }
      
      System.out.println("********");
      
    for(Object o:al) {
    	System.out.println(o);
    }
      
      System.out.println("*****");
      
      Iterator itr = al.iterator();//forward
      
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      System.out.println("******");
      
     ListIterator litr =al.listIterator(al.size()); //backward
     
     while(litr.hasPrevious())
     {
    	 System.out.println(litr.previous());
     }
      
      
     LinkedList ll = new LinkedList();
     
     ll.add(1000);
     ll.add(150);
     ll.add(2000);
     ll.add(300);
     ll.add(400);
     ll.add(500);
     ll.add("ExcelR");
     ll.add("hyd");
     
     Iterator idtr1 = ll.descendingIterator(); //LinkedList, ArrayDeque,
      
     System.out.println("It is descending iterator");       //TrreSet
     
     while(idtr1.hasNext())
     {
    	 System.out.println(idtr1.next());
     }
     
	}

}
