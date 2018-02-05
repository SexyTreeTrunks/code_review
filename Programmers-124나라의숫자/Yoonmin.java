class OneTwoFour {
	public String change124(int n) {
		String answer = "";
		int coefficient = 0; // 계수
		int base_number = 3; // 기준 수

//		
//		while(base_number < n) {
//			base_number *= 3;
//		}
//		
//		while (n > 0) {
//			base_number /= 3;
//			for (int i = 1; i <= 3; i++) { // i = {1, 2, 3}
//				if (n > base_number * i) {
//					coefficient = i;
//				}
//			}
//			base_number *= coefficient;
//			n -= base_number;
//			answer += Integer.toString(coefficient);
//		}
		//answer.replace("3", "4");
		
		for(int i=0; n > 0; i++) {
			coefficient = n % base_number;
			n /= base_number;
			if(coefficient == 0) {
				n--;
				coefficient = base_number + 1;//+1 for 4
			}
			answer += Integer.toString(coefficient);
		}

		return 	(new StringBuilder(answer)).reverse().toString();
	}

	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
	}
}
