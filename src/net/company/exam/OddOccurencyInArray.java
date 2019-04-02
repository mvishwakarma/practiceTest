package net.company.exam;

import java.util.Arrays;

public class OddOccurencyInArray {

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 int return1 = 1;
		 Arrays.sort(A);
		 
		 for (int i=0 ;i<A.length-1 ; i++){
			 int j = i+1;
			 if (A[i] == A[j]){
				A[i] = 0;
				A[j] = 0;
				i++;
			 }
		 }
		 
		 for (int i=0;i<A.length; i++){
			 if (A[i]!= 0){
				 return1 = A[i];
			 }
		 }
		 
		 return return1;
	    }
	 
	public static void main(String[] args) {
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution(A ));

	}

}
