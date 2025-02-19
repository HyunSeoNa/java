package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * fileName     : BaekJoon18870
 * author       : HyunSeo Na
 * date         : 2025-02-19
 * description  : 백준 18870 좌표 압축
 * https://www.acmicpc.net/problem/18870
 */
public class BaekJoon18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");


        int[] arr = new int[count];
        int[] arrSorted = new int[count];
        HashMap<Integer, Integer> idxMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < count; i++){
            int num = Integer.parseInt(line[i]);
            arr[i] = num;
            arrSorted[i] = num;
        }

        Arrays.sort(arrSorted);
        int idx = 0;
        for(int n : arrSorted){
            if(!idxMap.containsKey(n)){
                idxMap.put(n, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int n : arr) {
            sb.append(idxMap.get(n)).append(" ");
        }
        System.out.println(sb.toString());
    }
}
