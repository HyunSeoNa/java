package com.nahs.study;

import java.util.Arrays;
import java.util.List;

/**
 * fileName     : ArraysEx.java
 * author       : hyunseo
 * date         : 2025. 1. 30.
 * description  : Arrays 클래스 유용한 메소드
 */
public class ArraysEx {
    public static void main(String[] args) {

        // 배열을 문자열로 출력하기
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(intArr));

        // 배열을 오름차순으로 정렬하기
        String[] strArr = {"z", "e", "b", "r", "a"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);

        // 정렬된 배열에서 특정 값을 이진 탐색하여 인덱스를 반환한다.
        int index = Arrays.binarySearch(strArr, "z");
        System.out.println("z의 인덱스 : " + index);

        // 배열 복사 : 배열을 원하는 실이만큼 복사할 때 사용
        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr2Copy = Arrays.copyOf(intArr2, 10); // 나머지는 0으로 채워짐
        System.out.println(Arrays.toString(intArr2Copy));

        // 배열 부분 복사 : 시작 인덱스 포함, 끝 인덱스 제외
        int[] intArr2Copy2 = Arrays.copyOfRange(intArr2, 1,3);
        System.out.println(Arrays.toString(intArr2Copy2));

        // 배열 비교 : 두 배열이 같은지 비교
        String[] strArr2 = {"aaa", "bbb", "ccc"};
        String[] strArr3 = {"aaa", "bbb", "ccc"};
        String[] strArr4 = {"aaa", "bbb", "ddd"};

        System.out.println(Arrays.equals(strArr2, strArr3));
        System.out.println(Arrays.equals(strArr3, strArr4));

        // 배열 채우기 : 배열의 모든 요소를 특정 값으로 채운다.
        String[] strArr5 = new String[10];
        Arrays.fill(strArr5, "a");
        System.out.println(Arrays.toString(strArr5));

        // 배열을 리스트로 반환하기
        List<String> list = Arrays.asList(strArr5);
        System.out.println(list);
    }
}

