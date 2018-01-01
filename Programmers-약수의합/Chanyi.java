class SumDivisor {
	public int sumDivisor(int num) {
		int answer = 0;
		
    for(int divider=1;divider<=num/2;divider++)
    	if(num%divider == 0) answer += divider;
		return answer + num;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}
}
