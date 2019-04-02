package net.company.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListToString {

	public static void main(String[] args) {
		
		 List<Long> ll = new ArrayList<Long>();
		 ll.add(6l);
		 ll.add(3l);
		 ll.add(4l);
		 ll.add(5l);
		 ll.add(2l);
		 
		 Collections.sort(ll);
		 
		 String str = ll.toString();
		 System.out.println(str);
		 
		 System.out.println((ll.toString()).equalsIgnoreCase("[2, 3, 4, 5, 6]"));
		 

	}

}
