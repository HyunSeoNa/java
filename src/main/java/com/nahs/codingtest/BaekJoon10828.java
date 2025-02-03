package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * fileName     : BaekJoon10828
 * author       : HyunSeo Na
 * date         : 2025-02-03
 * description  : 백준 10828 스택
 */
public class BaekJoon10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            String[] command = br.readLine().split(" ");

            if("push".equals(command[0])) {
                stack.push(Integer.parseInt(command[1]));
            } else if("pop".equals(command[0])) {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pop());
            } else if("size".equals(command[0])) {
                System.out.println(stack.size());
            } else if("empty".equals(command[0])) {
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if("top".equals(command[0])) {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peek());
            }
        }
    }

}
