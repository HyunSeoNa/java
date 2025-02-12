package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * fileName     : BaekJoon14235
 * author       : HyunSeo Na
 * date         : 2025-02-12
 * description  : 백준 14235
 * https://www.acmicpc.net/problem/14235
 */
public class BaekJoon14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> gift = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < count; i++){
            String[] line = br.readLine().trim().split(" ");

            int point = Integer.parseInt(line[0]);

            if(point == 0) {
                if(gift.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(gift.poll());
                }
            } else {
                for(int j = 1; j <= point; j++){
                    gift.add(Integer.parseInt(line[j]));
                }
            }
        }
    }
}
