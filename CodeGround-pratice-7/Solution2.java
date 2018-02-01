package code_review;

import java.util.Scanner;
import java.util.HashSet;

class Solution2 {
    public static HashSet<Integer> OneSet;
    public static HashSet<Integer> TwoSet;
    //public static HashSet<Integer> ThreeSet;

    public static boolean[] Three;

    public static void insert(int num) {
        if(OneSet.contains(num)) //�׻� hashset�� Ž�� --> O(n^2)
            return;

        OneSet.add(num);

        int temp;

        for(Integer one : OneSet) {
            temp = one + num;
            TwoSet.add(temp);
        }

        for(Integer two : TwoSet) {
            temp = two + num;
            if(-100000 <= temp && temp <= 100000)
                Three[temp + 100000] = true;

            //ThreeSet.add(temp);
        }
        /*
      	�� 3���� hashset ��ȸ --> 3*(n-1)*n --> 0(n^2)������ solution1�� ��쿡 ���� ������ 3��
      	�׷��� �ǹ��� �� : solution1�� �� 0.3, solution2�� �� 1.8.. hashset�� 3����� ���� �˰����� �����Ѵٸ� ���� 7���� ��������..why?
        hashset�� insertion�� O(1)���ٵ�...?
        http://mdshannan1.blogspot.kr/2012/08/arraylist-vs-linkedlist-vs-hashset.html
              ��뷮�� �����͸� insertion�Ҷ� arraylist, linkedlist�� ���� �����ս��� �������� ���� �����ִ�.
              ���Ǽ�: ������ �ؽ��浹�� �ƴұ� ����. �ٸ� Ű���� �������� hashfunction���� ���� ���� ������ �ִ�.
        http://d2.naver.com/helloworld/831311
        https://stackoverflow.com/questions/4980757/how-do-hashtables-deal-with-collisions
        */
    }

    public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);

        int TC;
        int test_case;

        TC = sc.nextInt();
        for(test_case = 1; test_case <= TC; test_case++) {
            // �� �κп��� �˰��� ���α׷��� �ۼ��Ͻʽÿ�.
            OneSet = new HashSet<>();
            TwoSet = new HashSet<>();
            //ThreeSet = new HashSet<>();
            Three = new boolean[200001];

            int N = sc.nextInt();

            int count = 0;

            int[] num = new int[N];

            for(int n = 0; n < N; n++)
                num[n] = sc.nextInt();

            for(int n = 0; n < N; n++) {
                //if(ThreeSet.contains(num[n]))
                if(Three[num[n] + 100000])
                    count++;

                insert(num[n]); // �� n�� call�� (�⺻ O(n))
            }

            // �� �κп��� ������ ����Ͻʽÿ�.
            System.out.println("Case #" + test_case);
            System.out.println(count);
        }
    }
}