package net.company.exam;

public class GenomicRangeQuery {
	
	public static int factor(char ch){
		
		if (ch == 'A'){
			return 1;
		}else if (ch == 'C'){
			return 2;
		}else if (ch == 'G'){
			return 3;
		}else if (ch == 'T'){
			return 4;
		}
		
		return 0;
	}
	
		public static int[] solution(String S, int[] P, int[] Q){
		
			
			int pair = P.length;
			int[] ret = new int[pair];
	
			for (int i=0;i<pair;i++){
				char one = S.charAt(P[i]);
				char two = S.charAt(Q[i]);
				
				ret[i] = Math.min(factor(one), factor(two));
				
			}
			
			return ret;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
