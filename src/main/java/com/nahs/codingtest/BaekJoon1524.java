package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * fileName     : BaekJoon1524
 * author       : HyunSeo Na
 * date         : 2025-02-19
 * description  : 백준 1524 세준세비
 * https://www.acmicpc.net/problem/1524
 */
public class BaekJoon1524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            PriorityQueue<Integer> sbq = new PriorityQueue<Integer>();
            PriorityQueue<Integer> sjq = new PriorityQueue<Integer>();
            br.readLine();
            String[] countLine = br.readLine().split(" ");
            String[] sj = br.readLine().split(" ");
            String[] sb = br.readLine().split(" ");

            for(String s : sb) {
                sbq.add(Integer.parseInt(s));
            }


            for(String s : sj) {
                sjq.add(Integer.parseInt(s));
            }

            while(!sbq.isEmpty() && !sjq.isEmpty()){
                int sbi = sbq.peek();
                int sji = sjq.peek();

                if(sji >= sbi) {      // 세준이 이기거나 비긴경우
                    sbq.poll();
                } else {
                    sjq.poll();
                }
            }

            if(sbq.isEmpty() && sjq.isEmpty()) {
                System.out.println("C");
            }

            if(!sbq.isEmpty()) {
                System.out.println("B");
            }

            if(!sjq.isEmpty()) {
                System.out.println("S");
            }
        }
    }
}
