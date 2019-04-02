package net.company.exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeCutExam {

	public static int isArraySorted(int[] B, int n){
		if (n ==0 || n == 1){
			return 1;
		}
		
		for (int i = 0 ; i < n-1 ; i++){
			if (B[i+1] < B[i]){
				return 0;
			}
		}
		return 1;
	}
	
	 public static int solution(int[] A) {
		 int count =0;
		 int len = A.length;
		 int[]B = new int[len-1];
		 
		 if (isArraySorted(A,len) == 1){
			 return len;
		 }
		 
		 for (int i=0;i<A.length;i++){
			 List<Integer> arrayList = IntStream.of(A) 
		                                      .boxed() 
		                                      .collect(Collectors.toList()); 
		        arrayList.remove(i); 
		        B = arrayList.stream().mapToInt(Integer::intValue).toArray(); 
			
		        int isSorted = isArraySorted(B,B.length);
		        if (isSorted == 1) count++;
		 }
		 return count;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
