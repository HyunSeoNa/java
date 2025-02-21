package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * fileName     : BaekJoon31860
 * author       : HyunSeo Na
 * date         : 2025-02-21
 * description  : 백준 31860 열심히 일하는 중
 * https://www.acmicpc.net/problem/31860
 */
public class BaekJoon31860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int count = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int k = Integer.parseInt(line[2]);
        int y = 0;
        PriorityQueue<Integer> jobQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());

        /* 입력 */
        for(int i = 0; i < count; i++) {
            jobQueue.add(Integer.parseInt(br.readLine()));
        }

        int days = 0;
        List<Integer> yList = new ArrayList<Integer>();
        while(!jobQueue.isEmpty()) {
            int n = jobQueue.poll();
            int t = n - m;
            if(t > k) {
                jobQueue.add(t);
            }

            y = (y / 2) + n;
            yList.add(y);

            days++;
        }

        StringBuilder builder = new StringBuilder();
        builder.append(days).append("\n");
        for(Integer n : yList) {
            builder.append(n).append("\n");
        }
        System.out.println(builder.toString());
    }
}
