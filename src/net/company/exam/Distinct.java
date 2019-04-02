package net.company.exam;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static int solution( int[] A) {
    	int count = 0;
    	Set ss = new HashSet<>();
    	for(int i=0; i< A.length; i++){
    		ss.add(A[i]);
    	}
    	count = ss.size();
    	return count;
    }
	public static void main(String[] args) {
		int[] A = {2,2,2,2,2};

	}

}
