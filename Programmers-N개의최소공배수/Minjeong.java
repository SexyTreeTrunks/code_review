package code_review;

public class NLCM {
	public long nlcm(int[] num) {
		long answer = 0;
		long gcd = answer= num[0];
		for(int i = 1; i < num.length; i++) {
			gcd = getGCD(answer, num[i]);
			answer = answer * num[i] / gcd;
		}
		return answer;
	}
	
	public long getGCD(long a, long b) {
		if( a % b != 0 )
			return getGCD(b, a%b);
		else
			return b;
	}
	
	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 6,8,18,12 };//{ 2,6,8,14 }-->168 {6,8,18,12}-->72
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}
