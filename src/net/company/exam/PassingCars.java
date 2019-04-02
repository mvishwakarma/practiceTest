package net.company.exam;

public class PassingCars {
	public static int solution(int[] A){
		int len = A.length;
		int maxCounter = 1000000000;
		int zeroCount = 0;
		int paiers = 0;
		
		for (int i=0;i<len;i++){
			if (A[i]== 0) zeroCount++;
			else if (A[i] == 1) paiers += zeroCount;
			
			if (paiers > maxCounter) return -1;
		}
		
		return paiers;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
