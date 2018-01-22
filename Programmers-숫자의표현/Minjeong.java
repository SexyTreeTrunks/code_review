package code_review;

public class Expressions {

	public static int expression_answer(int num) {
		int answer = 0;
		int sum=0;
		for(int i=1;i<=num;i++) {
			int j;
			for(j=i;sum < num;j++)
				sum+=j;
			if(sum==num) {
				answer++;
				System.out.println("i: " +i+ ", j: " + j + "mid: " + (i+j)/2);	
			}
			sum=0;
		}
		return answer;
	}
	

	public static int expression(int num) {
		int answer = 1;
		int q = num;
		if(num % 2 == 1)
			answer++;
		for(int i = 2; i < num; i++) {//ÇÏÁö¸¸ ÀÌ for¹®µµ ¾îÂ¥ÇÇ È¦¼öÀÎ ¾à¼ö¸¸ Ã£À¸¸é µÇ´Ï±î i=1ºÎÅÍ i+=2 ÇØ°¡¸é¼­(È¦¼ö¸¸ ºñ±³ÇÏ°Ô) È¦¼ö°ªÀÌ 2·Î ³ª´²Áö´ÂÁö¸¸ º¸¸éµÊ.
			if(num % i == 0) {
				q = num / i;
				if(i % 2 == 1)
					answer++;
			}
		}
		return answer;
	}
	/* https://m.blog.naver.com/PostView.nhn?blogId=askmrkwon&logNo=220881206015&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
	 * 12 --> 3 4 5
	 * 
	 * 15
	 * 3*5
	 * 
	 * 72
	 * 1X72 -->72
	 * 2X36 -->X
	 * 3X24 --> 23 24 25
	 * 
	 * 4x18 --> 18 18 18 18 
	 * 		--> 17 18 18 19 --> 
	 * 6X12 -->X
	 * 8X9 --> 8 8 8 8 8 8 8 8 8 -> 4 5 6 7 8 9 10 11 12
	 * 
	 * 21
	 * 1x21
	 * 3x7 --> 3 3 3 3 3 3 3 .... 3 > 7/2=3
	 * 		--> 3 3 3 3 3 3 3 3 3 3 ---> 
	 * 		--> 7 7 7
	 */
	/*
	 * 1 2 3 4 6 12 43 86 129 172 258 516
		1x516 2x258 3x172 4x129 6x86 12x43
				NO	    È¦Â¦	Â¦È¦	   NO	Â¦È¦
		3x129  7x13
		È¦È¦
		1 x 72 2x36 3x24 4x18 6x12 8x9
		1x21 3x7
		3x24
	 */
}
