package ch13_ArrayList.Task13;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
       int [][]array={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("changeMultiArraytoOneList(array) = " + changeMultiArraytoOneList(array));
    }

    private static ArrayList<Integer> changeMultiArraytoOneList(int[][] array) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int[] i : array) {
            for (int j : i) {
                list.add(j);
            }
        }


        return list;
    }
}