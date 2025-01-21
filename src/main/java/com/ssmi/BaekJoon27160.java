package com.ssmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * fileName     : BaekJoon27160
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 백준 27160 할리갈리
 */
public class BaekJoon27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        map.put("STRAWBERRY", 0);
        map.put("BANANA", 0);
        map.put("LIME", 0);
        map.put("PLUM", 0);

        for(int i = 0; i < count; i++) {
            String line = br.readLine();
            String[] lineSplit = line.split(" ");

            int curCount = map.get(lineSplit[0]);
            map.put(lineSplit[0], Integer.parseInt(lineSplit[1]) + curCount);
        }

        Optional<String> success = map.entrySet().stream()
                .filter(e -> e.getValue() == 5)
                .map(Map.Entry::getKey)
                .findFirst();

        if(success.isPresent()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
