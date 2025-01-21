package com.ssmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * fileName     : BaekJoon11945
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 백준 11945 뜨거운 붕어빵
 */
public class BaekJoon11945 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();

            String[] factor = input.split(" ");

            int count = Integer.parseInt(factor[0]);

            StringBuilder result = new StringBuilder();
            for(int i = 0; i < count; i++) {
                StringBuffer strBr = new StringBuffer(br.readLine());
                result.append(strBr.reverse()+ "\n");
            }
            System.out.println(result.toString());
        }
}
