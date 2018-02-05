package programmers;

public class OneTwoFour {
	public String change124(int n) {
		String answer = "";
		
		int len;//len: 124로 표현한 뒤의 자릿수,  
		
		
		for(len=1 ; n > (Math.pow(3, len+1)-3)/2 ; len++); //등비수열의 합 공식 이용
		
		answer = "";
		
		int nth=(int) (n-(Math.pow(3, len)-3)/2);
		for(int i=1 ; i<len ;i++){
			if(nth%(Math.pow(3, len-i))==0){
				switch (nth/(int)(Math.pow(3, len-i))){
				case 0:
					answer=answer+4;
					break;
				case 1:
					answer=answer+1;
					break;
				case 2:
					answer=answer+2;
					break;
				}
			} else {
				switch (nth/(int)(Math.pow(3, len-i))){
				case 0:
					answer=answer+1;
					break;
				case 1:
					answer=answer+2;
					break;
				case 2:
					answer=answer+4;
					break;
				}
			}
			nth%=(Math.pow(3, len-i));
		}
		switch (nth){
		case 0:
			answer=answer+4;
			break;
		case 1:
			answer=answer+1;
			break;
		case 2:
			answer=answer+2;
			break;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
//		System.out.println(oneTwoFour.change124(10));
		System.out.println(oneTwoFour.change124(23));
		// TODO Auto-generated method stub

	}

}
