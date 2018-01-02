package programmers;


public class getMinMaxString {
    public String getMinMaxString(String str) {
      String[] array_str = str.split("\\s+");
      int num = Integer.parseInt(array_str[0]);
      int min = num, max = num;
      
      for (int i = 1 ; i < array_str.length ; i++){
        num = Integer.parseInt(array_str[i]);
      	if(min>num) min=num;
        else if(max<num) max=num;
      }
        
        return String.format("%d %d", min, max);
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        getMinMaxString minMax = new getMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}