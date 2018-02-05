package code_review;

class OneTwoFour {
	public String change124(int n) {
		StringBuffer answer = new StringBuffer();
		while(n != 0) {
			int r = n % 3;
			n = n / 3;
			if(r == 0) {
				n--;
				answer.append("4");
			} else {
				answer.append(Integer.toString(r));
			}
		}
		
		return answer.reverse().toString();
	}
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
	}
}
