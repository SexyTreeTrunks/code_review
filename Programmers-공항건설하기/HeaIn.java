import java.util.*;

class TryHelloWorld
{
    public int chooseCity(int n, int [][]city) {
      int answer = 0;
      Arrays.sort(city, new Comparator<int[]>() {
        @Override
        public int compare(final int[] entry1, final int[] entry2) {
          final int loc1 = entry1[0];
          final int loc2 = entry2[0];
          return Integer.compare(loc1, loc2);
        }
      });
      
      int sum = 0;
      for(int i = 0; i < city.length; i++)
      	sum += city[i][1];
        
      int temp = 0;
      for(int i = 0; i < city.length; i++) {
        temp += city[i][1];
        //전체 인구의 절반이 넘어가는 순간 멈춤
        if(temp >= sum / 2) {
          answer = city[i][0];
          break;
        }
      }
      
      return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int tn = 3;
        int [][]tcity = {{2,2},{1,5},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }
}