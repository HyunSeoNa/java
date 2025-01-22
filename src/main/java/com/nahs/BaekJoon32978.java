package com.nahs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * fileName     : BaekJoon32978
 * author       : HyunSeo Na
 * date         : 2025-01-22
 * description  : 백준 32978 아 맞다 마늘
 */
public class BaekJoon32978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String line = br.readLine();
        String[] selection = line.split(" ");

        line = br.readLine();
        String[] used = line.split(" ");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(selection));

        for(String s : used) {
            hashSet.remove(s);
        }

        System.out.println(hashSet.iterator().next());
    }
}
