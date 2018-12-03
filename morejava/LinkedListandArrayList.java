import java.util.*;
public class LinkedListandArrayList {
public static void main (String [] args) {
	List<String> l1 = new ArrayList<String>();
	List <String> l2 = new LinkedList<String>();
	
	l1.add("Miguel");
	l1.add("Angel");
	l1.add("Felix");
	l1.add("Gallardo");
			
	l2.add("Miguel");
	l2.add("Angel");
	l2.add("Felix");
	l2.add("Gallardo");
		System.out.println("Array List : "+l1);
		System.out.println("Linked List: "+l2);
		
	
	
}
}
