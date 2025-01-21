package com.ssmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * fileName     : Programmers12916
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 프로그래머스 12916
 * 문자열 내 p와 y의 개수
 */
public class Programmers12916 {
    boolean solution(String s) {
        boolean answer = true;

        long countP = countChar(s.toUpperCase(), 'P');
        long countY = countChar(s.toUpperCase(), 'Y');

        return countP == countY;
    }

    long countChar(String origin, char findCh) {
        return origin.chars().filter(ch -> ch == findCh).count();
    }
}
