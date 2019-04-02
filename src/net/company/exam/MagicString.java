package net.company.exam;

public class MagicString {
	
	public static String solution(int A, int B) {
		StringBuilder sb = new StringBuilder();
		
		int countA = A;
		int countB = B;
		int count = 0;
		while (count < A+B ){
			if ( countA >= countB+2){
				sb.append("aa");
				count += 2;
				countA -= 2;
			}else if (countB >= countA+2){
				sb.append("bb");
				count += 2;
				countB -= 2;
			}else if (countB == countA){
				if (sb.length() == 0){
					sb.append("ab");
				}
				else if (sb.charAt(sb.length()-1) == 'a'){
					sb.append("ba");	
				}else if (sb.charAt(sb.length()-1) == 'b'){
					sb.append("ab");
				}
				
				count += 2;
				countA--;
				countB--;
			}else if (countA == 1){
				sb.append("a");
				count++;
				countA--;
			}else if (countB == 1){
				sb.append("b");
				count++;
				countB--;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
