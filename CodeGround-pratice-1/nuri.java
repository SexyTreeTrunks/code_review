//점수 : 0점 ??? 제외 했는데 왜 빵점인지 모르게씀 @_@
import java.util.Scanner;

/*
 As the name of the class should be Solution , using Solution.java as the filename is recommended.
 In any case, you can execute your program by running 'java Solution' command.
*/
class Solution {
  static int Answer;

  public static void main(String args[]) throws Exception {
      /*
         The method below means that the program will read from input.txt, instead of standard(keyboard) input.
         To test your program, you may save input data in input.txt file,
         and call below method to read from the file when using nextInt() method.
         You may remove the comment symbols(//) in the below statement and use it.
         But before submission, you must remove the freopen function or rewrite comment symbols(//).
       */

      /*
         Make new scanner from standard input System.in, and read data.
       */
      Scanner sc = new Scanner(System.in);
      //Scanner sc = new Scanner(new FileInputStream("input.txt"));

      int T = sc.nextInt();
      for(int test_case = 0; test_case < T; test_case++) {

          Answer = 0;
          /////////////////////////////////////////////////////////////////////////////////////////////
          int num = sc.nextInt();
          int [] inputNum = new int [num];
          for (int i = 0; i<num ; i++){
            inputNum[i] = sc.nextInt();
          }
          for (int i = 0; i<num ; i++){
            for (int j = i+1; j<num;j++){
              if(inputNum[i] !=0 && inputNum[j]==inputNum[i]){
                inputNum[i]=0;
                inputNum[j]=0;
                break;
              }
            }
          }
          for (int i = 0; i<num ; i++){
            System.out.println(inputNum[i]);
            if(inputNum[i]!=0)
              Answer ^=inputNum[i];
          }
          /////////////////////////////////////////////////////////////////////////////////////////////


          // Print the answer to standard output(screen).
          System.out.println("Case #"+(test_case+1));
          System.out.println(Answer);
    }
  }
}
