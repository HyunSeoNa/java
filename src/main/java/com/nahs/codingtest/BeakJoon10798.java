package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * fileName     : BeakJoon10798
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 백준 10798 세로읽기
 */
public class BeakJoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputLine = null;
        StringBuffer sb = new StringBuffer();

        int maxSize = 0;

        while( (inputLine = br.readLine()) != null) {

            if( inputLine.length() > maxSize ) {
                maxSize = inputLine.length();
            }

            sb.append(inputLine);
            sb.append(",");
        }

        String[] lineStr = sb.toString().split(",");
        sb.delete(0, sb.length());      // 초기화
        for(int i = 0; i < maxSize; i++) {
            for(String str : lineStr) {
                try {
                    sb.append(str.charAt(i));
                } catch(StringIndexOutOfBoundsException e) {
                    sb.append("");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
