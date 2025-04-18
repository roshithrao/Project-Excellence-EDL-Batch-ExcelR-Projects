import java.util.*;

public class LaunchHashSet
{
	public static void main(String[] args) {
		
    LinkedHashSet hs = new LinkedHashSet();
	
	hs.add(121);
	hs.add(100);
	hs.add(200);
	hs.add(20);
	hs.add(12);
	
	System.out.println(hs.toString());
	
	if(hs.contains(121))
	{
	    System.out.println("It is there");
	}
		
	}
}

