package ch15_Varargs;

public class Task01 {
    public static void main(String[] args) {
/*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.

input : "m", "e", "r", "v", "e";
output : merve

input : "a", "l", "i";
output : ali

 */
        String[] arr1 = {"m", "e", "r", "v", "e"};
        String[] arr2 = {"a", "l", "i"};
        concateden(arr1);
        concateden(arr2);
        concateden("tester", "qa", "sdet");

    }

    private static void concateden(String... var) {
        String ss = "";
        for (String w : var) {
            ss += w;
        }
        System.out.println(ss);


    }


    {

    }
}

