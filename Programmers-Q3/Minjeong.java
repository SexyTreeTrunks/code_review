package code_review;

class SumDivisor {
	public int sumDivisor(int num) {
		int answer = 0;
		int break_num = num;
		for (int i = 1; i < break_num; i++) {
			if(num % i == 0) {
				answer += i;
				break_num = num / i;
				answer += break_num;
			}
		}
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(6));
		System.out.println(c.sumDivisor(12)); //1,2,3,4,6,12
		//1,2,3,7,21,42
	}
}
