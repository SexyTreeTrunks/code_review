class Collatz {
	public int collatz(int num) {
		int answer = 0;
    System.out.println("num: "+num);
    
    while(answer<500){
      if (num==1){
        return answer;
      }
      else {
        if(num%2==0){
          System.out.println("num/2: "+num);
          num/=2;
        }
        else{
          System.out.println("num*3+!: "+num);
        	num=num*3+1;
        }
        answer++;
        System.out.println("answer++: "+answer);
      }
    }
    
    return -1;

	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}