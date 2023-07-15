package ch13_ArrayList.Task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

        ArrayList<String>arrayList=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println("arrayList = " + arrayList);
        ArrayList<String> rotatedList = rotateList(arrayList);
        System.out.println("Rotated List: " + rotatedList);
    }

    private static ArrayList<String> rotateList(ArrayList<String> arrayList) {
        Collections.reverse(arrayList);
        return arrayList;
    }
}




    






