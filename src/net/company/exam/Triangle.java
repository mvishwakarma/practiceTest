package net.company.exam;

public class Triangle {
	public static int check(int[] A, int i, int j, int k){
		if (A[i] + A[j] > A[k] && A[j] + A[k] > A[i] && A[k]+A[i] > A[j])
			return 1;
		
		return 0;
	}
	
	public static int solution(int[] A){
		
		for (int i=0;  i< A.length; i++)
			for (int j = i+1; j< A.length ; j++)
				for (int k = j+1; k<A.length ; k++){
					int res = check (A,i,j,k);
					if (res == 1) return 1;
				}
		return 0; // not find triplate
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
