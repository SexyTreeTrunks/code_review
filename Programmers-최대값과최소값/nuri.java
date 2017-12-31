public class GetMinMaxString {
    public String getMinMaxString(String str) {
      String[] splitStr = str.split(" ");
      String min, max;
      int i;
      if (Integer.parseInt(splitStr[0])<Integer.parseInt(splitStr[1])){
        min = splitStr[0];
        max = splitStr[1];
      }
      else{
        min = splitStr[1];
        max = splitStr[0];
      }
      for (i=2;i<splitStr.length;i++){
        if (Integer.parseInt(splitStr[i])<Integer.parseInt(min))
          min = splitStr[i];
        if (Integer.parseInt(splitStr[i])>Integer.parseInt(max))
          max = splitStr[i];
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
