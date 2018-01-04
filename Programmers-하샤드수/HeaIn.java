public class HarshadNumber{
	public boolean isHarshad(int num){
		int numberLength = (int)Math.log10(num) + 1;
        int temp = num;
        int sum = 0;
        while(numberLength > 0) {
            sum += temp % 10;
            temp /= 10;
            numberLength--;
        }

        if(num % sum == 0)
            return true;
        else
            return false;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}