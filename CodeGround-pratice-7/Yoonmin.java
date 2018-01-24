import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Ex6 {
	static int Answer;

	public static void main(String args[]) throws Exception {
        long start = System.currentTimeMillis();
        
		Scanner sc = new Scanner(System.in);
      
      int T = sc.nextInt();
      int temp = 0;
      int temp_num = 0;

      ArrayList<Integer> double_seq = new ArrayList<Integer>();

      for (int test_case = 0; test_case < T; test_case++) {
         int num = sc.nextInt();
         int[] seq = new int[num];
         boolean[] isGoodnum = new boolean[num];

         for(int i=0; i<num; i++) {
        	 temp_num = sc.nextInt();
        	 seq[i] = temp_num;
        	 double_seq.add(temp_num*2);
        	 temp = (temp < seq[i])? seq[i]: temp;
         }
         
         for(int i=0; i<num; i++) {
        	 temp_num = seq[i] *3;
        	 if(temp_num > temp) {continue;}
        	 for(int j=num-1; (j>0) && (seq[j] == temp_num); j--) {
        		 	 isGoodnum[j] = true;
        	 }
         }
         
         for(int i=num-1; i>0; i--) {
        	 for(int j=i-1; (j>=0) && (seq[i]>seq[j]); j--) {
        		 temp_num = seq[i]-seq[j];
        		 if(double_seq.contains(temp_num) && isGoodnum[i]!=true) {
        			 isGoodnum[i] = true;
        		 }
        	 }
         }
         
         for(int i=num-1; (i>0) && (isGoodnum[i]!=true); i--) {
        	 for(int j=i-1; j>0; j--) {
        		 temp_num = (seq[i] - seq[j]) *2;
        		 if(double_seq.contains(temp_num) && isGoodnum[i]!=true) {
        			 isGoodnum[i] = true;
        		 }
        	 }
         }
         
         for(boolean b: isGoodnum) {
        	 Answer = (b == true)? Answer+1: Answer;
         }
         
         System.out.println("Case #" + (test_case + 1));
         System.out.println(Answer);
         

         long end = System.currentTimeMillis();
         System.out.println( "실행 시간 : " + ( end - start )/1000.0 );

      }
      
   }
}