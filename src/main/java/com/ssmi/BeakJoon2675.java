package com.ssmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * fileName     : BeakJoon2675
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 백준 2675
 */
public class BeakJoon2675 {
    public static void main(String[] args) throws IOException {
        // 1. 실행 횟수 입력 받기
        BufferedReader bufferedRd = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedRd.readLine());
        // 2. 실행 횟수 만큼 for문
        for(int i = 0; i < count; i++) {
            // 1) 반복 횟수와 문자열 입력 받기
            StringBuilder result = new StringBuilder();
            String str = bufferedRd.readLine();
            // 2) 문자열 자르기(횟수/문자열)
            String[] factors = str.split(" ");
            // 3) 문자열 한 글자씩 순회하면서 입력된 반복 횟수만큼 반복학.
            int rep = Integer.parseInt(factors[0]);
            factors[1].chars().forEach(c -> {
                result.append(Character.toString(c).repeat(rep));
            });
            System.out.println(result.toString());
        }
        bufferedRd.close();
    }
}
