package code_review;

import java.util.Scanner;
import java.util.HashSet;

class Solution2 {
    public static HashSet<Integer> OneSet;
    public static HashSet<Integer> TwoSet;
    //public static HashSet<Integer> ThreeSet;

    public static boolean[] Three;

    public static void insert(int num) {
        if(OneSet.contains(num)) //항상 hashset을 탐색 --> O(n^2)
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
      	총 3번의 hashset 순회 --> 3*(n-1)*n --> 0(n^2)이지만 solution1의 경우에 비해 차수가 3배
      	그래도 의문인 점 : solution1은 약 0.3, solution2는 약 1.8.. hashset을 3개썼던 기존 알고리즘을 생각한다면 거의 7배의 성능차이..why?
        hashset은 insertion에 O(1)일텐데...?
        http://mdshannan1.blogspot.kr/2012/08/arraylist-vs-linkedlist-vs-hashset.html
              대용량의 데이터를 insertion할때 arraylist, linkedlist에 비해 퍼포먼스가 떨어지는 것을 볼수있다.
              뇌피셜: 원인은 해시충돌이 아닐까 생각. 다른 키값이 들어오더라도 hashfunction으로 나온 값은 같을수 있다.
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
            // 이 부분에서 알고리즘 프로그램을 작성하십시오.
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

                insert(num[n]); // 총 n번 call됨 (기본 O(n))
            }

            // 이 부분에서 정답을 출력하십시오.
            System.out.println("Case #" + test_case);
            System.out.println(count);
        }
    }
}