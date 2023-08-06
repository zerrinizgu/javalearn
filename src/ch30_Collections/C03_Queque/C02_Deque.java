package ch30_Collections.C03_Queque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C02_Deque {
    public static void main(String[] args) {
        Deque<String> dq1=new LinkedList<>(
                Arrays.asList("almanya", "hollanada", "fransain", "amerikana", "afrika", "brezil", "yeni zeland"));
        System.out.println("dq1 = " + dq1);
        dq1.add("turkiye");
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1.getLast() = " + dq1.getLast());
       // System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("dq1 = " + dq1);
        dq1.clear();
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
       // System.out.println("dq1.getFirst() = " + dq1.getFirst());
        Deque<String> dq2=new LinkedList<>(
                Arrays.asList("almanya", "hollanada", "fransain", "amerikana", "afrika", "brezil", "yeni zeland"));
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2 = " + dq2);
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
        System.out.println("dq2 = " + dq2);
        System.out.println("dq2.removeLast() = " + dq2.removeLast());
        dq2.clear();
        System.out.println("dq2.pollLast() = " + dq2.pollLast());


    }
}
