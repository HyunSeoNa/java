package com.nahs.codingtest;

import java.util.Arrays;

/**
 * fileName     : Programmers12916
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 프로그래머스 12916 - 전화번호 목록
 */
public class Programmers42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }
}
