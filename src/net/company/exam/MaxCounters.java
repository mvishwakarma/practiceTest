package net.company.exam;

import java.util.Arrays;

public class MaxCounters {

    public static int[] solution( int N, int[] A) {

    	int[] counters = new int[N];
    	 int maxcounter =0;
    	
    	
    	for(int i=0; i<A.length; i++){
    		if (A[i] >= 1 && A[i] <= N){
    		    int temp = A[i];
    		    temp--;
    			counters[temp] = counters[temp]+1;
    			if (maxcounter < counters[temp]){
    				maxcounter = counters[temp];
    			}
    			
    		} else if ( A[i] == N +1){
    	//		Arrays.setAll(counters, g);
    			Arrays.fill(counters, maxcounter);
    			/*for (int j=0;j<counters.length;j++){
    				counters[j] = maxcounter;
    			}*/
    		}
    	}
    	return counters;
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
