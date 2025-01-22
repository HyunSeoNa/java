package com.nahs.study;

import java.util.HashMap;
import java.util.Map;

/**
 * fileName     : null.java
 * author       : hyunseo
 * date         : 2025. 1. 22.
 * description  : Map 예제
 */
public class MapEx {
    public static void main(String[] args) {
        /*Map<Integer, Double> map = Map.of(
                1, 0.1, 2, 0.2, 3, 0.3, 4, 0.4, 5, 0.5,
                6, 0.6, 7, 0.7, 8, 0.8, 9, 0.9, 10, 1.0,
                11, 1.1
        );*/

        Map<Integer, Double> map = Map.ofEntries(
                Map.entry(1, 0.1), Map.entry(2, 0.2), Map.entry(3, 0.3), Map.entry(4, 0.4), Map.entry(5, 0.5),
                Map.entry(6, 0.6), Map.entry(7, 0.7), Map.entry(8, 0.8), Map.entry(9, 0.9), Map.entry(10, 1.0),
                Map.entry(11, 1.1)
        );

    }
}
