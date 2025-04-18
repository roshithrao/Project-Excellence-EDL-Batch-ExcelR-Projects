import java.util.*;

class LaunchHashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "sachin");
		hm.put(7, "dhoni");
		hm.put(18, "kohli");
		hm.put(45, "rohith");
		System.out.println(hm);// hm.toString() will be called

		Set s = hm.keySet();// To get the keys from Map
		System.out.println(s);

		System.out.println(s.getClass().getName());
		System.out.println();
		Collection c = hm.values();// To get the values from Map
		System.out.println(c);
		System.out.println(c.getClass().getName());
		System.out.println();
		Set mapData = hm.entrySet();// To get the K,V from Map as Set
		System.out.println(mapData);
		System.out.println(mapData.getClass().getName());
		System.out.println();

		Iterator itr = mapData.iterator();
		while (itr.hasNext()) {
//Object is return type of next(), 
//i am converting to Map.Entry  Object to call methods of Entry interface 
// The data of Map.Entry is stored as object 
			Map.Entry data = (Map.Entry) itr.next();

			System.out.println(data.getClass().getName());
			System.out.println(data.getKey() + ": " + data.getValue());

			if (data.getKey().equals(10)) {
				data.setValue("SRT");
			}
		}
		System.out.println();
		System.out.println(hm);
	}
}