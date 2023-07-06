package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConverttoList {
    public static void main(String[] args) {
        String[] names={"Ali", "Zeynep", "Fatih", "Safak","Derya"};
        System.out.println(Arrays.toString(names));
        List<String>nameList=Arrays.asList(names);
        System.out.println(nameList);



    }
}
