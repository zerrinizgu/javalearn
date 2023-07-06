package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("madagaskar", "Almanya", "polonya", "UGANDAGA", "ITALYA"));
        System.out.println(country);
        System.out.println(country.contains("almanya"));


    }
}
