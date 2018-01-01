public class GetMinMaxString {
    public String getMinMaxString(String str) {
      String[] splitedNumbers = str.split(" ");  
      int max = Integer.parseInt(splitedNumbers[0]);
      int min = max;
      
      for(int i = 1; i < splitedNumbers.length; i++) {
        int number = Integer.parseInt(splitedNumbers[i]);
        if(number > max)
          max = number;
        if(number < min)
          min = number;
      }
      
      return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}