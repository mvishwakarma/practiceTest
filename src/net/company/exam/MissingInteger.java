package net.company.exam;

import java.util.Arrays;

public class MissingInteger {

	
	  public static int  solution(int[] A) {
		  
		  
	        // write your code in Java SE 8
	        Arrays.sort(A);
	        
	        int length = A.length;
	        if (length ==0 ) return 1;
	        int start = A[0];
	        if (length == 1) return start > 1 ? start -1 : start+1;
	        
	        for (int i=0; i<length; i++){
	            if (A[i] != start+i) return start+i;
	        }
	        return start > 1 ? start -1 :  A[length-1]+1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
