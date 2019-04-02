package net.company.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class findRank {

	 public static int solution(int[] ranks) {
	        // write your code in Java SE 8
		 Arrays.sort(ranks);
		 
		 int sameCount = 0, count = 0;
		 
		 Map<Integer,Integer> countMap = new TreeMap<Integer,Integer>();
		 
		 for (int i=0;i<ranks.length;i++){
			 if (countMap.containsKey(ranks[i])){
				 int value = (int) countMap.get(ranks[i]);
				 value++;
				 countMap.put(ranks[i], value); 
			 } else {
				 countMap.put(ranks[i], 1); 
			 }
			 
		 }
		 
	
		 
		
		 Map.Entry<Integer,Integer> oldentry = null;
		 for (Map.Entry<Integer,Integer> entry : countMap.entrySet())  {
			 if (oldentry == null ){
				 sameCount = entry.getValue();
			 } else if (oldentry.getKey()+1 == entry.getKey()){
				 count += sameCount;
				 sameCount =entry.getValue();
			 } else {
				 sameCount =entry.getValue();
			 }
			 oldentry = entry;
			 
		 }
	          
		 return count;
	    }
	 
	public static void main(String[] args) {
		//int[] A = {3, 4, 3, 0, 2, 2, 3, 0, 0} ;
		int[] A = {4, 2, 0};
		//System.out.println(A.length);
		//int k = 3;
		System.out.println(""+solution(A));

	}

}
