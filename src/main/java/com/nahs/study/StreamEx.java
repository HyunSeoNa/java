package com.nahs.study;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * fileName     : StreamEx
 * author       : HyunSeo Na
 * date         : 2025-01-23
 * description  : Stream 예제
 */
public class StreamEx {
    public static void main(String[] args) {
        /* 리스트에서 짝수 필터링 후 제곱 */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 짝수 필터링 후 제곱
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)  // 짝수 필터링
                .map(n -> n * n)         // 제곱
                .collect(Collectors.toList()); // 리스트로 변환

        System.out.println(result); // 출력: [4, 16, 36]

        /* 문자열 정렬 및 중복 제거 */
        List<String> fruit = Arrays.asList("Apple", "Banana", "Grape", "Melon", "Orange");

        // 정렬 및 중복 제거
        fruit.stream()
                .distinct()            // 중복 제거
                .sorted()             // 정렬
                .forEach(System.out::println);

        /* 컬렉션에서 그룹화 */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Bob");

                // 이름별 그룹화
        Map<String, Long> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println(grouped); // 출력: {Alice=1, Bob=2, Charlie=1, David=1}
    }
}
