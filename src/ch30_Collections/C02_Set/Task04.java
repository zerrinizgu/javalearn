package ch30_Collections.C02_Set;

import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        long startTimeHashSet = System.nanoTime();
        HashSet<Integer>hashSet=new HashSet<>();
        Random random=new Random();
        for (int i = 0; i < 100; i++) {
          hashSet.add(random.nextInt(1000)) ;
        }
        long endTimeHashSet = System.nanoTime();
        System.out.println("endTimeHashSet-startTimeHashSet = " + (endTimeHashSet - startTimeHashSet));
        System.out.println("hashSet = " + hashSet);
        long startTimeTreeSet = System.nanoTime();
       TreeSet<Integer>treeSet=new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            treeSet.add(random.nextInt(1000)) ;
        }
        long endTimeTreeSet = System.nanoTime();
        System.out.println("endTimeTreeSet-startTimeTreeSet = " + (endTimeTreeSet - startTimeTreeSet));

        TreeSet<Integer>treeSet2=new TreeSet<>(hashSet);
        System.out.println("treeSet2 = " + treeSet2);

    }




    }





