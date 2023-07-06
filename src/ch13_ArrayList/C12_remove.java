package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya","uganda", "Polonya", "İtalya"));
        System.out.println(country);
        Collections.sort(country);
        System.out.println(country.remove("norvec"));
        System.out.println(country.remove("uganda"));
        System.out.println(country.remove(0));
        System.out.println(country);
        country.add("Amerika");
        country.add("Hollanda");
        country.add("Ukraina");
        country.add("Amerika");
        System.out.println(country.remove("Amerika"));
        System.out.println(country);
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);
        country.addAll(city);
        System.out.println(country);
        System.out.println(country.removeAll(city));
        System.out.println(city);
        System.out.println(country);

    }
}
