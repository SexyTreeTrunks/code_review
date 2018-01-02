import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	
    	String[] input_string = str.split(" ");
    	int[] number = new int[input_string.length];
    	
    	for(int i = 0; i < input_string.length; i++) {
    		number[i] = Integer.parseInt(input_string[i]);
    	}
    	
    	Arrays.sort(number);
    	
    	return  Integer.toString(number[0]) + " "+ Integer.toString(number[number.length-1]);
    }

    public static void main(String[] args) {
        String str = "3 4 -2 1";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}