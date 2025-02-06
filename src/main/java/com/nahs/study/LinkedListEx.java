package com.nahs.study;

import java.util.LinkedList;

/**
 * fileName     : LinkedListEx
 * author       : HyunSeo Na
 * date         : 2025-02-06
 * description  : LinkedList 예제
 */
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("List : " + list);
        System.out.println("List : " + list.getFirst());
        System.out.println("List : " + list.getLast());
        System.out.println("List : " + list.size());
        System.out.println("List : " + list.remove());
        System.out.println("List : " + list);
    }
}
