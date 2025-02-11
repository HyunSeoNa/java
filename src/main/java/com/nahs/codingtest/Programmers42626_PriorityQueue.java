package com.nahs.codingtest;


import java.util.PriorityQueue;

/**
 * fileName     : Programmers42626
 * author       : HyunSeo Na
 * date         : 2025-02-10
 * description  : 프로그래머스 42626 더 맵게
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 */
public class Programmers42626_PriorityQueue {
    public int solution(int[] scoville, int K) {

        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i : scoville) {
            pq.add(i);
        }

        // 섞을 필요가 없는 경우
        if(pq.peek() >= K) {
            return 0;
        }

        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int mixed = first + (second * 2);
            pq.add(mixed);
            answer++;

            if(pq.peek() >= K) {
                return answer;
            }
        }

        return -1;
    }
}
