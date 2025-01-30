package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * fileName     : BaekJoon31562
 * author       : HyunSeo Na
 * date         : 2025-01-23
 * description  : 백준 31562 전주 듣고 노래 맞히기
 */
public class BaekJoon31562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> songMap = new HashMap<>();

        String line = br.readLine();

        String[] countArr = line.split(" ");

        int songCount = Integer.parseInt(countArr[0]);
        int gameCount = Integer.parseInt(countArr[1]);

        for(int i = 0; i < songCount; i++) {
            line = br.readLine();
            String[] songArr = line.split(" ");

            songMap.put(songArr[1], songArr[2]+songArr[3]+songArr[4]);
        }

        for(int j = 0; j < gameCount; j++) {
            String result = "";
            int resultCount = 0;    // 노래가 여려개 있는 경우 파악을 위해서
            
            line = br.readLine();
            String finalLine = line.replace(" ", "");
            List<String> resultList = songMap.keySet()
                    .stream().
                    filter(e -> finalLine.startsWith(songMap.get(e)))
                    .collect(Collectors.toList());

            /* 결과 출력 */
            if(resultList.isEmpty())
                System.out.println("!");
            else if(resultList.size() == 1)
                System.out.println(resultList.get(0));
            else
                System.out.println("?");
        }
    }
}
