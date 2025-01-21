package com.ssmi;

import java.io.*;

/**
 * fileName     : BaekJoon11719
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 백준 11719
 */
public class BaekJoon11719 {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader bufferedRd = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWt = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        String str = null;    // 입력 받을 문자열
        while((str = bufferedRd.readLine()) != null) {
            result.append(str).append("\n");
        }

        bufferedWt.write(result.toString());

        bufferedRd.close();
        bufferedWt.flush();
        bufferedWt.close();
    }
}
