class OneTwoFour {
	public String change124(int n) {
		String answer = "";
  	while(n > 0) {
      int remain = n % 3;
      n /= 3;
      if(remain == 0)
        n -= 1;
      
      if(remain == 0)
        answer = 4 + answer;
      else if(remain == 1)
        answer = 1 + answer;
      else
        answer = 2 + answer;
    }

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
    //1 2 3	(1 2 3)
    //11 12 13 (4 5 6)
    //21 22 23 (7 8 9)
    //41 42 43 (10 11 12)
    //111 112 113 (13 14 15)
    //3의 배수는 3으로 끝남
    //3으로 나눠 떨어질 경우 -1을 해줘야 함 (15 / 3을 해보기)
    //1 2 3을 1 2 4로 바꿔주기
	}
}
