package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * fileName     : BaekJoon20291.java
 * author       : hyunseo
 * date         : 2025. 2. 17.
 * description  : 백준 20291 파일정리
 * https://www.acmicpc.net/problem/20291
 */
public class BaekJoon20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Map<String, Integer> fileExtMap = new HashMap<>();
        for(int i = 0; i < count; i++) {
            //System.out.println(br.readLine());
            String[] file = br.readLine().split("\\.");
            if(!fileExtMap.containsKey(file[1])) {
                fileExtMap.put(file[1], 1);
            } else {
                fileExtMap.put(file[1], fileExtMap.get(file[1]) + 1);
            }
        }

        fileExtMap.keySet().stream().sorted().forEach(key -> System.out.println(key + " " +fileExtMap.get(key)));
    }
}
