package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber=new ArrayList<>(Arrays.asList(1,2,5,4,3,66,99,55,88,35,34));
        System.out.println(listNumber);
        Collections.replaceAll(listNumber,1,111);
        System.out.println(listNumber);


    }
}
