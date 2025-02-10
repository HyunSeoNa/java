package com.nahs.codingtest;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * fileName     : Programmers42626
 * author       : HyunSeo Na
 * date         : 2025-02-10
 * description  : 프로그래머스 42626 더 맵게
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 */
public class Programmers42626 {
    /*
    한개씩 읽으면서 K 보다 작으면
    * */
    public int solution(int[] scoville, int K) {
            int answer = 0;

            // 정렬
            Arrays.sort(scoville);

            List<Integer> test = Arrays.stream(scoville).boxed().collect(Collectors.toList());
            // 섞을 필요가 없음.
            if(scoville[0] >= K) {
                return answer;
            }

            while(true) {
                long count = test.stream().filter(x -> x < K).count();
                if(count == 0) {
                    break;
                }
                if(test.size() == 1) {
                    if(test.get(0) < K) answer = -1;
                    break;
                }

                int s = test.get(0);
                //System.out.println("s = " + s);
                if(s < K) {
                    int first = test.get(0);
                    int second = test.get(1);
                    //System.out.println("first = " + first + ", second = " + second);
                    int mixed = first + (second * 2);
                    test.remove(0);
                    test.remove(0);
                    test.add(mixed);
                    test.sort(Integer::compareTo);
                    answer++;
                }
            }
            return answer;
        }
}
