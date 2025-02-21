package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * fileName     : BaekJoon3048
 * author       : HyunSeo Na
 * date         : 2025-02-20
 * description  : 백준 3048 개미
 * https://www.acmicpc.net/problem/3048
 */
public class BaekJoon3048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] countLine = br.readLine().split(" ");
        String a = br.readLine();
        String b = br.readLine();

        List<String[]> ab = new ArrayList<String[]>();
        //String[] ab = new String [a.length + b.length];
        for(int i = a.length()-1 ; i >= 0; i--) {
            //ab[i] = a[i];

            ab.add(new String[] { String.valueOf(a.charAt(i)), "L"});
        }
        for(int i = 0; i < b.length(); i++) {
            //ab[a.length + i] = b[i];
            ab.add(new String[] {String.valueOf(b.charAt(i)), "R"});
        }

        int rep = Integer.parseInt(br.readLine());
        for(int r = 0; r < rep; r++) {
            for (int i = 0; i < ab.size()-1; i++) {
                String[] cur = ab.get(i);
                String[] next = ab.get(i+1);
                if (!cur[1].equals(next[1]) && "R".equals(next[1])) {
                    ab.set(i, next);
                    ab.set(i+1, cur);
                    i++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ab.size(); i++) {
            sb.append(ab.get(i)[0]);
        }
        System.out.println(sb.toString());
    }
}
