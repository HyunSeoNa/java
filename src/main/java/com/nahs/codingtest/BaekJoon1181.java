package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 * fileName     : BaekJoon1181
 * author       : HyunSeo Na
 * date         : 2025-02-21
 * description  : 백준 1181 단어정렬
 * https://www.acmicpc.net/problem/1181
 */
public class BaekJoon1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> stringSet = new TreeSet<String>();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            stringSet.add(br.readLine());
        }

        PriorityQueue pq = new PriorityQueue(new Comparator<String>(){
            public int compare(String o1, String o2){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length()-o2.length();
            }
        });

        stringSet.stream().forEach(pq::offer);

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            sb.append(pq.poll()).append("\n");
        }

        System.out.println(sb.toString());
    }
}
