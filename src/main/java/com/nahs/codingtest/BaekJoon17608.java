package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * fileName     : BaekJoon17608.java
 * author       : hyunseo
 * date         : 2025. 2. 4.
 * description  : 백준 17608
 * https://www.acmicpc.net/problem/17608
 */
public class BaekJoon17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < count; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int resultCount = 1;
        int max = stack.pop();
        while(!stack.isEmpty()) {
            int popped = stack.pop();
            if(popped > max) {
                resultCount++;
                max = popped;
            }
        }
        System.out.println(resultCount);
    }
}
