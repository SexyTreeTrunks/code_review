class Collatz {
	public int collatz(long num) {
		int answer = 0;
		while(num != 1) {
      if(answer >= 500)
        return -1;
      
      if(num % 2 == 0)
        num /= 2;
      else
        num = num * 3 + 1;
      answer++;
    }
		return answer;
	}

	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}