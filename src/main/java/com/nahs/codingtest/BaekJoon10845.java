package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * fileName     : BaekJoon10845
 * author       : HyunSeo Na
 * date         : 2025-02-05
 * description  : 백준 10845 큐
 * https://www.acmicpc.net/problem/10845
 */
public class BaekJoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");

            if("push".equals(line[0])) queue.add(Integer.parseInt(line[1]));
            else if("pop".equals(line[0])) System.out.println(queue.isEmpty() ? -1 : queue.poll());
            else if("size".equals(line[0])) System.out.println(queue.size());
            else if("empty".equals(line[0])) System.out.println(queue.isEmpty() ? 1 : 0);
            else if("front".equals(line[0])) System.out.println(queue.isEmpty() ? -1 :queue.getFirst());
            else if("back".equals(line[0])) System.out.println(queue.isEmpty() ? -1 :queue.getLast());
        }
    }
}
