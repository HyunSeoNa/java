package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * fileName     : BaekJoon11286
 * author       : HyunSeo Na
 * date         : 2025-02-13
 * description  : 백준 11285 - 절댓값 힙
 * https://www.acmicpc.net/problem/11286
 */
public class BaekJoon11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> priorityQ = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = Math.abs(o1) - Math.abs(o2);
                if(result == 0) {
                    if(o1 > o2) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
                return result;
            }
        });
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++) {
            int n = Integer.parseInt(br.readLine());

            if( n == 0) {
                if(priorityQ.isEmpty()) {
                    //System.out.println(0);
                    sb.append(0);
                    sb.append("\n");
                } else {
                    //System.out.println(priorityQ.poll());
                    sb.append(priorityQ.poll());
                    sb.append("\n");
                }
            } else {
                priorityQ.add(n);
            }
        }
        System.out.println("---");
        System.out.println(sb);
    }
}
