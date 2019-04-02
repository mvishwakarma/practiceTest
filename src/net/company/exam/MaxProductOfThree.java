package net.company.exam;

import java.util.Arrays;

public class MaxProductOfThree {
	
	public static int solution(int[] A){
		int len = A.length;
		if (len <3) return 0;
		
		Arrays.sort(A);
		
		return Math.max(A[0]*A[1]*A[len-1],A[len-1]*A[len-2]*A[len-3]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
