package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * fileName     : BaekJoon28107
 * author       : HyunSeo Na
 * date         : 2025-02-14
 * description  : 백준 28107
 * https://www.acmicpc.net/problem/28107
 */
public class BaekJoon28107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] countLine = br.readLine().split(" ");
        int customer = Integer.parseInt(countLine[0]);
        int[] result = new int[customer];

        Map<Integer, PriorityQueue<Integer>> menuCustomerMap = new HashMap<Integer, PriorityQueue<Integer>>();
        for(int i = 0; i < customer; i++) {
            String[] menuList = br.readLine().split(" ");
            for(int j = 1; j <= Integer.parseInt(menuList[0]); j++) {
                int menuNum = Integer.parseInt(menuList[j]);
                if(!menuCustomerMap.containsKey(menuNum)) {
                    PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
                    temp.add(i);
                    menuCustomerMap.put(menuNum, temp);
                } else {
                    menuCustomerMap.get(menuNum).add(i);
                }
            }
        }

        String[] menuList = br.readLine().split(" ");
        for(int i = 0; i < menuList.length; i++) {
            int menuNum = Integer.parseInt(menuList[i]);
            if(menuCustomerMap.containsKey(menuNum)) {
                if(!menuCustomerMap.get(menuNum).isEmpty()) {
                    int idx = menuCustomerMap.get(menuNum).poll();
                    result[idx]++;
                }
            }
        }

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
