import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
      String[] strarr = str.split(" ");
     	int[] intarr = new int[strarr.length];
     	
      for(int i = 0; i < strarr.length; i++)
        intarr[i] = Integer.parseInt(strarr[i]);
			
      Arrays.sort(intarr);
      String maxmin = intarr[0] + " " + intarr[intarr.length-1];

        return maxmin;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}