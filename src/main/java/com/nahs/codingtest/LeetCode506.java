package com.nahs.codingtest;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * fileName     : null.java
 * author       : hyunseo
 * date         : 2025. 2. 11.
 * description  : LeetCode506
 * https://leetcode.com/problems/relative-ranks/
 */
public class LeetCode506 {
    static class Factor implements Comparable<Factor> {
        int idx;
        int value;

        public Factor(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }

        @Override
        public int compareTo(Factor o) {
            if (this.value < o.value) {
                return 1;
            } else if(this.value == o.value) {
                return 0;
            } else {
                return -1;
            }
        }
    }
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        PriorityQueue<Factor> queue = new PriorityQueue<>(Factor::compareTo);

        for(int i = 0; i < score.length; i++) {
            queue.add(new Factor(i, score[i]));
        }

        int i = 0;
        while(!queue.isEmpty()) {
            Factor factor = queue.poll();
            if(i == 0) {
                result[factor.idx] = "Gold Medal";
            } else if(i == 1) {
                result[factor.idx] = "Silver Medal";
            } else if(i == 2) {
                result[factor.idx] = "Bronze Medal";
            } else {
                result[factor.idx] = String.valueOf(i+1);
            }
            i++;
        }
        return result;
    }

}
