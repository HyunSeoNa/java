package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * fileName     : BaekJoon32953
 * author       : HyunSeo Na
 * date         : 2025-01-24
 * description  : 백준 32953 회상
 */
public class BaekJoon32953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        Map<String, Integer> studentMap = new HashMap<>();

        for(int i = 0; i < n; i++) {

            int studentCount = Integer.parseInt(br.readLine());
            line = br.readLine().split(" ");

            for (String s : line) {
                if (studentMap.containsKey(s)) {
                    studentMap.put(s, studentMap.get(s) + 1);
                } else {
                    studentMap.put(s, 1);
                }
            }
        }

        System.out.println(studentMap.keySet().stream().filter(s -> studentMap.get(s) >= m).count());
    }
}
