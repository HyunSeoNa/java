package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * fileName     : BaekJoon26043
 * author       : HyunSeo Na
 * date         : 2025-02-06
 * description  : 백준 26043
 * https://www.acmicpc.net/problem/26043
 */
public class BaekJoon26043 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<int[]> queue = new LinkedList<>();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");
            if(line[0].equals("1")) {
                int student = Integer.parseInt(line[1]);
                int menu = Integer.parseInt(line[2]);
                queue.add(new int[]{student, menu});
            } else {
                if(!queue.isEmpty()) {
                    int[] poll = queue.poll();
                    if(poll[1] == Integer.parseInt(line[1])) a.add(poll[0]);
                    else b.add(poll[0]);
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        if(a.isEmpty()) {
            builder.append("None" + "\n");
        } else {
            Collections.sort(a);
            for(int s: a) {
                builder.append(s + " ");
            }
            builder.append("\n");
        }

        if(b.isEmpty()) {
            builder.append("None" + "\n");
        } else {
            Collections.sort(b);
            for(int s: b) {
                builder.append(s + " ");
            }
            builder.append("\n");
        }

        if(queue.isEmpty()) {
            builder.append("None" + "\n");
        } else {
            while(!queue.isEmpty()) {
                c.add(queue.poll()[0]);
            }

            for(int s: c) {
                builder.append(s + " ");
            }
        }

        System.out.println(builder.toString());
    }
}
