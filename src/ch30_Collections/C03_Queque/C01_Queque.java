package ch30_Collections.C03_Queque;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queque {
    public static void main(String[] args) {
        Queue<String>   q1=new LinkedList<>(
                Arrays.asList("almanya", "hollanada", "fransain", "amerikana", "afrika", "brezil", "yeni zeland"));

        System.out.println("q1 = " + q1);
q1.add("turkiye");
        System.out.println("q1 = " + q1);
        Queue<String>   q2=new PriorityQueue<>(
                Arrays.asList("almanya", "hollanada", "fransain", "amerikana", "afrika", "brezil", "yeni zeland"));
        System.out.println("q2 = " + q2);
        q2.add("turkiye");
        q2.add("andorra");
        System.out.println("q2 = " + q2);
        System.out.println("q2.peek() = " + q2.peek());
        System.out.println("q2.remove() = " + q2.remove());
        System.out.println("q2 = " + q2);
        System.out.println("q2.poll() = " + q2.poll());
        System.out.println("q2 = " + q2);
        System.out.println("q2.element() = " + q2.element());
        System.out.println("q2 = " + q2);
q1.clear();
        System.out.println("q1 = " + q1);
        System.out.println("q1.poll() = " + q1.poll());
       // System.out.println("q1.remove() = " + q1.remove());
        q1.offer("madagaskar");
        System.out.println("q1 = " + q1);
    }
}
