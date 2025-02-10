package com.nahs.codingtest;

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
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));*/

        /* Programmers 12916 *//*
        Programmers12916 q1 = new Programmers12916();
        String str = br.readLine();
        System.out.println(q1.solution(str));*/

        /* Programmers 42577 *//*
        Programmers42577 p42577 = new Programmers42577();
        String[] str = {"119", "97674223", "1195524421"};
        //String[] str = {"123","456","789"};               // false
        //String[] str = {"12","123","1235","567","88"};    // true
        //String[] str = {"123", "2345", "23467"};          // false
        System.out.println(p42577.solution(str));*/


        /* Programmers 42626 더 맵게 */
        Programmers42626 p42626 = new Programmers42626();
        //int result = p42626.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        int result = p42626.solution(new int[]{1, 2, 3}, 100);
        System.out.println("426426 result : " + result);
    }
}