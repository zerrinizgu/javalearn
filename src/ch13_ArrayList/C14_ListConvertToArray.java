package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));
        System.out.println("city = " + city);

        Object[] arrcity = city.toArray();
        System.out.println(Arrays.toString(arrcity));
        String[] arrCity = city.toArray(new String[0]);
        System.out.println(Arrays.toString(arrCity));

    }
}
