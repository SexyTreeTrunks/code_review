public class Expressions {

	public int expressions(int num) {
		int answer = 0; int sum;
		for(int i=1; i<=num; i++) {
			sum = 0;
			for(int j=i; sum <= num; j++) {
				sum += j;
				if(sum == num) answer++;
			}
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}