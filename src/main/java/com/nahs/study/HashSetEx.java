package com.nahs.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * fileName     : HashSetEx
 * author       : HyunSeo Na
 * date         : 2025-01-22
 * description  : HashSet 예제
 */
public class HashSetEx {
    public static void main(String[] args) {
        /* 생성 방법 */
        // 기본 생성자
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("A");
        stringHashSet.add("B");
        stringHashSet.add("C");
        stringHashSet.add("D");

        // List로 생성
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("apple");
        stringArrayList.add("banana");
        stringArrayList.add("cherry");
        HashSet arrayHashSet = new HashSet(stringArrayList);

        // Stream API
        HashSet<String> streamHashSet = new HashSet<>(
                Arrays.asList("car", "bike", "bus")
        );

        /* 변환 */
        // 배열 -> Set
        String[] strArr = {"a", "b", "c", "d"};
        HashSet<String> setStr = new HashSet<String>(Arrays.asList(strArr));

        // Set -> 배열
        String[] setStrArr = setStr.toArray(new String[0]);
    }
}

