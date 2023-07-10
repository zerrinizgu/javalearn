import java.util.*;


public class Calisma_class {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
List<String> list1 = new ArrayList<String>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
ArrayList<String> list2 = new ArrayList<>();
        System.out.println("list1 = " + list1);

        for (int i = 0; i < list1.size() ; i++) {
            if(!list1.get(i).toLowerCase().contains("a"))
                list2.add(list1.get(i).toLowerCase());


        }

        System.out.println("list2 = " + list2);
        list1.clear();
        System.out.println("list1 = " + list1);
        list1.addAll(list2);
        System.out.println("list1 = " + list1);

    }
}



















