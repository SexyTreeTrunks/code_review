import java.util.*;

class NLCM {
  public long nlcm(int[] num) {
    if(num.length == 1)
      return num[0];
    long answer = num[0];
    for(int i = 0;i < num.length-1; i++) {
  		answer = lcm(answer, num[i + 1]);
    }
    return answer;
  }
  
  public long lcm(long a,long b) {
  	return a * b / gcd(a, b);        
  }
	
  public long gcd(long a,long b) {
  	if(a == 0)
    	return b;
    else
      return gcd(b % a, a);      
  }

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}