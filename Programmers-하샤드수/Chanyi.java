public class HarshadNumber{
	public boolean isHarshad(int num){
		int sum = 0;
    		int first = num;
    		while(first>0){
      			sum += first%10;
      			first = first/10;
    		}
    		if(num%sum == 0) 
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