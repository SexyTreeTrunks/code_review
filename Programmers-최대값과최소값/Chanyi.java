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
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
    }
}