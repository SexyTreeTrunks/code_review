
public class NumberExpressions {

	public int expressions(int num) {
		int answer = 0;
		for (int k=1 ; k<=num ; k++){
			for(int a=1 ; a<=num/k ; a++){
      	if(num==a*k+(k*k-k)/2){¡
          answer++;
        }
      }
    }
		return answer;
	}

	public static void main(String args[]) {
		NumberExpressions expressions = new NumberExpressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}