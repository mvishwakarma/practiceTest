package net.company.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrogRiverOne {
	

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
    	
    	
        int[] ret = new int[A.length];
        int k =0;
        for (int i=0;i<A.length;i++){
            if (A[i] == X) {
                ret[k++] = i; 
            }
        }
        
        if (k == 0) return -1;
        
    	boolean flag = false;
        for (int i=0;i<k;i++){
        	List aa = new ArrayList<>();
        	
        	
        	 flag = false;
        	for (int j=0;j<=ret[i];j++){
                aa.add(A[j]);
            }
        	for (int p=1; p<=X; p++){
        		if ( !aa.contains(p) ) {
        			flag = true;
        			break;
        		}
        		
        	}
        	
        	if (flag == false) return ret[i];
        }
        
        if (flag == true) return -1;
        return ret[0];
        
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		
		int[] A = {2,2,2,2,2};
		
		System.out.println(" "+ solution(2, A));

	}

}
