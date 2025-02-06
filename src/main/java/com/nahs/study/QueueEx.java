package com.nahs.study;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * fileName     : QueueEx
 * author       : HyunSeo Na
 * date         : 2025-02-06
 * description  : Queue 예제
 */
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        System.out.println("Queue : " + queue);
        System.out.println("Queue Size : " + queue.size());
        System.out.println("Queue Poll : " + queue.poll());
        System.out.println("Queue Poll : " + queue.peek());
        System.out.println("Queue isEmpty : " + queue.isEmpty());
        System.out.println("Queue : " + queue);

        /* ---------------------------------------------------------- */
        /* DeQueue */
        /* ---------------------------------------------------------- */
        System.out.println("----------------------------------------------------------");
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 10; i < 20; i++) {
            deque.add(i);
        }

        System.out.println("DeQueue : " + deque);
        System.out.println("DeQueue First: " + deque.getFirst());
        System.out.println("DeQueue Last: " + deque.getLast());
        System.out.println("DeQueue Peek : " + deque.peek());
        System.out.println("DeQueue Peek : " + deque.poll());
        System.out.println("DeQueue : " + deque);
    }
}
