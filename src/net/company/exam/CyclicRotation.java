package net.company.exam;

public class CyclicRotation {

	public static int[] solution(int[] A, int K){
		int length = A.length;
		int shiftCount = K % length;
		System.out.println("shiftcount"+shiftCount);
		
		for (int c=0;c<shiftCount;c++){
			int[] B = new int[length];
			
			//int start = A[0];
			int end = A[length-1];
			for (int i=0; i<length; i++){
				if (i == 0) B[i] = end;
				else B[i] = A[i-1];
			}
			A = B;
			
		}
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A = {3, 8, 9, 7, 6};
		
	//	int[] A = {3, 4, 3, 0, 2, 2, 3, 0, 0} 
		System.out.println(A.length);
		int k = 3;
		System.out.println(""+solution(A,k).toString());

	}

}
