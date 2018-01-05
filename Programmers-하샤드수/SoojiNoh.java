package programmers;
public class HarshadNumber{
	public boolean isHarshad(int num){
    int sum = 0;
    int m = 0;
    int condition = num;
    System.out.println("num= "+num);
    
		do{
    	sum+=condition%10;
      condition=condition/10;
    }while(condition>=1);
    
    if (num%sum!=0)
      return false;
    else
			return true;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}