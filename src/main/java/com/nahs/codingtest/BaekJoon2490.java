package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * fileName     : null.java
 * author       : hyunseo
 * date         : 2025. 1. 26.
 * description  : 백준 2490 윷놀이
 * https://www.acmicpc.net/problem/2490
 */

public class BaekJoon2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            String line = br.readLine();
            String[] yoot = line.split(" ");
            long zeroCount = Arrays.stream(yoot).filter(y -> y.equals("0")).count();

            if(zeroCount == 0) System.out.println("E");
            else if(zeroCount == 1) System.out.println("A");
            else if(zeroCount == 2) System.out.println("B");
            else if(zeroCount == 3) System.out.println("C");
            else if(zeroCount == 4) System.out.println("D");
        }
    }
}
