package com.nahs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * fileName     : main.java
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : main
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* Programmers 12916 */
        Programmers12916 q1 = new Programmers12916();
        String str = br.readLine();
        System.out.println(q1.solution(str));
    }
}