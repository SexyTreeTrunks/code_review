package code_review;

class Collatz {
    public int collatz(long num) {
        int answer = 0;
        while((num != 1) && (answer < 500) ) {
            num = (num % 2 == 0)? (num / 2):(num * 3 + 1);
            answer++;
        }
        return (answer == 500)? -1:answer;
    }

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		//System.out.println(c.collatz(6));
		//System.out.println(c.collatz(27));
		//System.out.println(c.collatz(999999));
		System.out.println(c.collatz(626331));
		//System.out.println(c.collatz(1252663));
		//System.out.println(c.collatz(999999001));
		//System.out.println(Integer.MAX_VALUE);//2147483647
		//System.out.println(Long.MAX_VALUE);//9223372036854775807
		
	}
}