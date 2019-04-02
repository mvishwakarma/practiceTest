package net.company.exam;

import java.util.Arrays;

public class TapeEquilibrium {

	  public static int  solution(int[] A) {	
		  
	  int length = A.length;
      int[] diffrence = new int[length-1];
      int part1=0,part2=0;
      int small = -1;
      
      if (length == 0) return 1;
      if (length == 1) return Math.abs(A[0]);
      if (length == 2) return Math.abs(A[0]-A[1]);
      
      /*for (int p=1;p<length-1;p++){
      	part1=0;part2=0;
      	for (int i=0;i<p;i++){
      		part1 += A[i];
      	}
      	for (int j=p ;j <length; j++){
      		part2 += A[j];
      	}
      	
      	diffrence[p-1] = Math.abs(part1-part2);
      	
      	if (small == -1) small = diffrence[p-1];
      	else if ( small > diffrence[p-1]) small = diffrence[p-1];
      	
      }*/
      
      // approach 2
      int sum =0;
      int leftsum =0;
      int diff = 0;
      for (int i=0;i<length;i++) sum+= A[i]; 
      for (int i=0;i<length-1;i++){
    	  sum -= A[i]; // right sum
    	  leftsum += A[i]; // left sum
    	  diff = Math.abs(leftsum-sum);
    	  if (small == -1) small = diff;
        	else if ( small > diff) small = diff;
      }
          return small;
          
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {-10, -20, -30, -40, 100};
		//int[] A = { 1, 2, 3, 4, 2};
		//int[] A = { 1, 1};
		
		System.out.println(solution(A));

	}

}
