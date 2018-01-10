class NLCM {
	public long nlcm(int[] num) {
		long answer = num[0];
		for(int i = 1; i<num.length; i++) {
			answer = LCM(answer, num[i]);
		}
		return answer;
	}

	long LCM(long a, long b) {
		long[] answer = new long[2];
		answer[1] = a *b;
		long temp;
		while(b!=0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		answer[0] = a;
		answer[1] = answer[1]/a;
		return answer[1];
	}
	
	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}